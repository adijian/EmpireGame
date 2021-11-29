package Empire;

import java.util.Scanner;

/*================
      Actions
 ================*/
public class Actions {
    public static void killVillagerCombat(Npc.Villager villagerToBeKilled) {
        if (villagerToBeKilled.hp == 0) {
            if (villagerToBeKilled.gender.equals("female"))
                System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! She fought and lived courageously");
            if (villagerToBeKilled.gender.equals("male"))
                System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! He fought and lived courageously");
            EmpireGame.Engine.villagersArray.remove(villagerToBeKilled);
        }

    }
    public static void killAction(){
        // Return full list of available villagers to kill
        for(int t = 0; t < EmpireGame.Engine.villagersArray.size(); t++) {
            System.out.println(t + 1 + ". " + EmpireGame.Engine.villagersArray.get(t).nickname);
        }
        System.out.println("x. Exit");
        // Create a Scanner object
        try {
            Scanner myObj = new Scanner(System.in);
            // Read user input
            int scanChosenVillager = myObj.nextInt();
            int chosenVillager = scanChosenVillager - 1;
            // Scan request to select villager to kill from previous list
            System.out.println("OH NO! " + EmpireGame.Engine.villagersArray.get(chosenVillager).nickname + " is dead! " + EmpireGame.Engine.villagersArray.get(chosenVillager).nickname + " has fought and lived courageously.");
            // remove villager from villagers list
            EmpireGame.Engine.villagersArray.remove(chosenVillager);
        }
        catch (Exception e){
            EmpireGame.Engine.userActionsInput();
            System.out.println("Not an action. Choose your destiny wisely.");
        }
    }

    public static int jobAssignWoodcutter(Villager villager){
        try {
            for (Villager d : Test.villagersArray) {
                if (d.getJob(villager).equals(" ")) {
                }
                Test.villagersArray.remove(villager);
                Test.villagersWoodcuttingArray.add(villager);
            }
        }
        catch (Exception e){
//            System.out.println("No more villagers left");
        }
        return Test.villagersWoodcuttingArray.size();
    }
}
