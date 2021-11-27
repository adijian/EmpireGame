package Empire;
import java.util.*;

public class EmpireGame {
        public static class Engine {
            /*================
                  Arrays
             ================*/
            public static List<String> townCenterArray = new ArrayList<>();
            public static List<String> villagersArray = new ArrayList<>();

        public static void gameStart(){
            System.out.println("================\n" +
                               "~ Game started ~\n" +
                               "================" +
                               "\n");

            CreateActions.initialCreationTownCenter();
            System.out.println("The total number of Town Centers is: " + EmpireGame.Engine.townCenterArray.size() + ".\n");
            System.out.println("The names of Town Centers are: " + EmpireGame.Engine.townCenterArray + ".\n");

            CreateActions.initialCreationVillagers();
            System.out.println("\nThe total number of villagers is: " + Engine.villagersArray.size() + ".");
            System.out.println("The names of the city's villagers are: " + EmpireGame.Engine.villagersArray + ".\n");
        }

        public static void userActionsInput() {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Choose desired action: ");
            System.out.println("1. Kill a villager");
            System.out.println("2. Create a villager");

            int action = myObj.nextInt();  // Read user input
            if (action == 1){
                System.out.println("Action chosen is to kill a villager.");
                Actions.killAction();
            }
            if (action == 2){
                System.out.println("Action chosen is to create a villager.");
                CreateActions.createVillager();
            }
            else {
                System.out.println("Not an action. Choose your destiny wisely.");
                userActionsInput();
            }
        }
}


    /*================
      ~ Main Loop    ~
     ================*/
    public static void main(String[] args) {
            Engine.gameStart();

            while (true) {
                Engine.userActionsInput();

            }
    }
}