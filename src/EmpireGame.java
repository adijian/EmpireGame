import java.util.*;
import java.util.stream.Collectors;

public class EmpireGame {
        public static class Engine {
            /*================
                  Arrays
             ================*/
            public static List<String> townCenterArray = new ArrayList<String>();
            public static List<String> villagersArray = new ArrayList<String>();


            /*================
                  Actions
             ================*/
            public static void Build(String building_built) {
                System.out.println(building_built + " has been built.");
            }

            public static void createVillager() {
                EmpireGame.Engine.Villager newVillager = new Engine.Villager();
                newVillager.number = Engine.villagersArray.size() + 1;
                Engine.villagersArray.add(newVillager.nickname);
                if (newVillager.gender.equals("female")) {
                    System.out.println("A new villager was born and raised.\nHer name is " + newVillager.nickname + "."
                            + " She is villager number " + newVillager.number + ".");
                }
                if (newVillager.gender.equals("male")) {
                    System.out.println("A new villager was born and raised.\nHis name is " + newVillager.nickname + "."
                            + " He is villager number " + newVillager.number + ".");
                }
            }

            public static void killVillager(Villager villagerToBeKilled){
                if (villagerToBeKilled.hp == 0) {
                    if (villagerToBeKilled.gender.equals("female"))
                        System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! She fought and lived courageously");
                    if (villagerToBeKilled.gender.equals("male"))
                        System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! He fought and lived courageously");
                    Engine.villagersArray.remove(villagerToBeKilled.nickname);
                }
            }

            public static void createTownCenter() {
                EmpireGame.Engine.Town_Center newTownCenter = new Engine.Town_Center();
                newTownCenter.number = Engine.townCenterArray.size();
                newTownCenter.name = newTownCenter.number + " Town Center";
                Engine.villagersArray.add(newTownCenter.name);
            }

            /*================
              Starting Actions
             ================*/
            // Each game provides the player with a town center, 4 villagers and a horse.
            public static void initialCreationTownCenter(){
                System.out.println("Building the First Town Center.");
                EmpireGame.Engine.Town_Center firstTownCenter = new Engine.Town_Center();
                firstTownCenter.name = "First Town Center";
                EmpireGame.Engine.Build(firstTownCenter.name);
                EmpireGame.Engine.townCenterArray.add(firstTownCenter.name);
            }

            public static void initialCreationVillagers(){
                System.out.println("Creating 4 founder villagers.\n");
                for(int i = 0; i < 4; i++){
                    Engine.createVillager();
                }
            }

            /*================
                  Buildings
             ================*/
            public static class Town_Center {
                int hp = 120;
                public int number;
                public String name = " ";

                void createVillagerFromTownCenter() {
                    EmpireGame.Engine.createVillager();
                }
            }

            /*================
                  NPCs
             ================*/
            static class Villager {
                // created from town

                int number;
                int hp = 20;
                String name;
                public String gender = determineGender();
                public String nickname = createNickname();
                String job;

                public String determineGender() {
                    Random rand = new Random();
                    int genderValue = rand.nextInt(2);
                    switch (genderValue) {
                        case 0:
                            return "male";
                        case 1:
                            return "female";
                    }
                    return gender = String.valueOf(genderValue);
                }
                public String createNickname() {
                    nickname = gender;
                    assert nickname != null;
                    if (nickname.equals("male")){
                        final String[] maleNickname = {"Eudes", "Garnier", "Gosse", "Josse", "Roul",
                                "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                                "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco"};
                        Random randomMale = new Random();
                        int index = randomMale.nextInt(maleNickname.length);
                        return maleNickname[index];
                    }
                    if (nickname.equals("female")){
                        final String[] maleNickname = {"Eudes", "Garnier", "Gosse", "Josse", "Roul",
                                "Roland", "Vauqelin", "Jehan", "Fernnand", "Piers",
                                "Geoffroi", "Estienne", "Guiscard", "Onfroi", "Franchesco"};
                        Random randomMale = new Random();
                        int index = randomMale.nextInt(maleNickname.length);
                        return maleNickname[index];
                    }
                    return nickname;
                }
        }
    }

    /*================
     Generic Functions
     ================*/
    public static void gameStart(){
        System.out.println("================\n" +
                           "~ Game started ~\n" +
                           "================" +
                           "\n");

        EmpireGame.Engine.initialCreationTownCenter();
        System.out.println("The total number of Town Centers is: " + EmpireGame.Engine.townCenterArray.size() + ".\n");
        System.out.println("The names of Town Centers are: " + EmpireGame.Engine.townCenterArray + ".\n");

        EmpireGame.Engine.initialCreationVillagers();
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
            killAction();
        }
        if (action == 2){
            System.out.println("Action chosen is to create a villager.");
            Engine.createVillager();
        }
        else {
            System.out.println("Not an action. Choose your destiny wisely.");
            userActionsInput();
        }
    }

    public static void killAction(){
        // Return full list of available villagers to kill
        for(int t = 0; t < Engine.villagersArray.size(); t++) {
            System.out.println(t + ". " + Engine.villagersArray.get(t));
        }
        System.out.println("x. Exit");
        // Create a Scanner object
        try {
            Scanner myObj = new Scanner(System.in);
            // Read user input
            int action1 = myObj.nextInt();
            // Scan request to select villager to kill from previous list
            System.out.println("OH NO! " + Engine.villagersArray.get(action1) + " is dead! " + Engine.villagersArray.get(action1) + " has fought and lived courageously.");
            // remove villager from villagers list
            Engine.villagersArray.remove(action1);
        }
        catch (Exception e){
            userActionsInput();
            System.out.println("Not an action. Choose your destiny wisely.");
        }
    }


    /*================
      ~ Main Loop    ~
     ================*/
    public static void main(String[] args) {
            gameStart();

            while (true) {
                userActionsInput();

            }
    }
}