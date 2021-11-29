package Empire;
import java.util.*;

/*================
~   Empire Game  ~
~     Engine     ~
================*/

public class EmpireGame {
        public static class Engine {
            /*================
                  Arrays
             ================*/
            public static ArrayList<Buildings.Town_Center> townCenterArray = new ArrayList<Buildings.Town_Center>();
            public static ArrayList<Npc.Villager> villagersArray = new ArrayList<Npc.Villager>();
            public static ArrayList<Villager> villagersWoodcuttingArray = new ArrayList<Villager>();
            public static ArrayList<Villager> villagersFarmingArray = new ArrayList<Villager>();
            public static ArrayList<Villager> villagersMiningArray = new ArrayList<Villager>();
            public static ArrayList<Villager> villagersBuildingArray = new ArrayList<Villager>();

        public static void gameStart(){
            try {
                System.out.println( "================\n" +
                                    "~ Game started ~\n" +
                                    "================" +
                                    "\n");

                CreateActions.initialCreationTownCenter();
                System.out.println("The total number of Town Centers is: " + EmpireGame.Engine.townCenterArray.size() + ".\n");
                for(int i = 0; i< Engine.townCenterArray.size();i++){
                System.out.println("The names of Town Centers are: " + Engine.townCenterArray.get(i).name + ".");
                }

                CreateActions.initialCreationVillagers();
                System.out.println("\nThe total number of villagers is: " + Engine.villagersArray.size() + ".");
                System.out.println("The names of the city's villagers are: ");
                for(int i = 0; i< Engine.villagersArray.size();i++){
                    System.out.println(Engine.villagersArray.get(i).nickname + ".");
                }
                System.out.println("\n");
            }
            catch (Exception e){
                gameStart();
            }
        }

            public static void userActionsInput() {
                try {
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Choose desired action: ");
                    System.out.println("1. Kill a villager");
                    System.out.println("2. Create a villager");
                    System.out.println("3. Reassign a villager");

                    int action = myObj.nextInt();  // Read user input
                    switch(action) {
                        case 1:
                            System.out.println("Action chosen is to kill a villager.");
                            Actions.killAction();
                            break;
                        case 2:
                            System.out.println("Action chosen is to create a villager.");
                            CreateActions.createVillager();
                            break;
                        case 3:
                            System.out.println("Not released yet.");
                            userActionsInput();
                    }
                }
                catch (Exception e){
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