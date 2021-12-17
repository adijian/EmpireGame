package Empire;

import java.util.Random;

public class CreateActions {

    public static void createVillagerGui() {
        Npc.Villager newVillager1 = new Npc.Villager();
        newVillager1.number = EmpireGame.Engine.villagersArray.size() + 1;
        EmpireGame.Engine.villagersArray.add(newVillager1);
        if (newVillager1.gender.equals("female")) {
            GUI.display.append("\nA new villager was born and raised.\nHer name is " + newVillager1.nickname + ". \nShe is villager number " + newVillager1.number + ".");
        }

        if (newVillager1.gender.equals("male")) {
            GUI.display.append("\nA new villager was born and raised.\nHis name is " + newVillager1.nickname + ". \nHe is villager number " + newVillager1.number + ".");
        }
        EmpireGame.GameRun.panelsNaming();
    }

        public static void createTownCenter() {

    }

        public static void transformVillagerstoFarmers() {
        Random r=new Random();
        int randomNumber=r.nextInt(EmpireGame.Engine.villagersArray.size());
        Npc.Villager randomVillager = EmpireGame.Engine.villagersArray.get(randomNumber);

        EmpireGame.Engine.villagersArray.remove(randomVillager);
        EmpireGame.Engine.villagersFarmingArray.add(randomVillager);

        GUI.display.append("\n" + randomVillager.nickname + " transformed to a farmer.");
        EmpireGame.GameRun.panelsNaming();

        }
        public static void Build(String building_built) {
        System.out.println(building_built + " has been built.");
    }

    //    public static void createTownCenter() {
//        Buildings.Town_Center newTownCenter = new Buildings.Town_Center();
//        newTownCenter.number = EmpireGame.Engine.townCenterArray.size();
//        newTownCenter.name = newTownCenter.number + " Town Center";
//        EmpireGame.Engine.townCenterArray.add(newTownCenter);
//    }

    /*================
      Starting Actions
     ================*/

    public static void initialCreationVillagers(){
        System.out.println("Creating 4 founder villagers.\n");
        for(int i = 0; i < 4; i++){
            CreateActions.createVillagerGui();
        }
    }

    public static void initialCreationTownCenter() {

    }
}
