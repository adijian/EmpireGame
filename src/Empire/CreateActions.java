package Empire;

import java.util.ArrayList;
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
        EmpireGame.GameRun.panelUpdate();
    }

        public static void createTownCenter() {

    }

        public static void transformVillagers(ArrayList<Npc.Villager> fromArray, ArrayList<Npc.Villager> toArray) {
            Random r=new Random();
            int randomNumber=r.nextInt(fromArray.size());
            Npc.Villager randomVillager = fromArray.get(randomNumber);

            fromArray.remove(randomVillager);
            toArray.add(randomVillager);

            EmpireGame.GameRun.panelUpdate();

            if (toArray == EmpireGame.Engine.villagersWoodcuttingArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has picked up an axe \nand became a maple woodcutter.");

            }
            if (toArray == EmpireGame.Engine.villagersFarmingArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has picked up a jar and started \ncollecting honey and became a farmer.");

            }
            if (toArray == EmpireGame.Engine.villagersBuildersArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has worn a constructor's hat \nand became a den builder.");

            }
            if (toArray == EmpireGame.Engine.villagersMiningArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has picked up a pickaxe \nand became a gold miner.");

            }
            if (toArray == EmpireGame.Engine.villlagersScholarsArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has picked up a book and robe \nand became an educated scholar.");

            }
            if (toArray == EmpireGame.Engine.villagersArray) {
                GUI.display.append("\n" + randomVillager.nickname + " has gone idle.");

            }
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
