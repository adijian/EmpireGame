package Empire;

import java.util.Scanner;

/*================
      Actions
 ================*/
public class Actions {
    public static void killVillager(Npc.Villager villagerToBeKilled) {
        if (villagerToBeKilled.hp == 0) {
            if (villagerToBeKilled.gender.equals("female"))
                System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! She fought and lived courageously");
            if (villagerToBeKilled.gender.equals("male"))
                System.out.println("OH NO! " + villagerToBeKilled.nickname + " is dead! He fought and lived courageously");
            EmpireGame.Engine.villagersArray.remove(villagerToBeKilled.nickname);
        }

    }
    public static void killAction(){
        // Return full list of available villagers to kill
        for(int t = 0; t < EmpireGame.Engine.villagersArray.size(); t++) {
            System.out.println(t + ". " + EmpireGame.Engine.villagersArray.get(t));
        }
        System.out.println("x. Exit");
        // Create a Scanner object
        try {
            Scanner myObj = new Scanner(System.in);
            // Read user input
            int action1 = myObj.nextInt();
            // Scan request to select villager to kill from previous list
            System.out.println("OH NO! " + EmpireGame.Engine.villagersArray.get(action1) + " is dead! " + EmpireGame.Engine.villagersArray.get(action1) + " has fought and lived courageously.");
            // remove villager from villagers list
            EmpireGame.Engine.villagersArray.remove(action1);
        }
        catch (Exception e){
            EmpireGame.Engine.userActionsInput();
            System.out.println("Not an action. Choose your destiny wisely.");
        }
    }
}
