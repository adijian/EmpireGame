package Empire;

public class CreateActions {
    /*================
      Starting Actions
     ================*/
    // Each game provides the player with a town center, 4 villagers and a horse.
    public static void initialCreationTownCenter(){
        System.out.println("Building the First Town Center.");
        Buildings.Town_Center firstTownCenter = new Buildings.Town_Center();
        firstTownCenter.name = "First Town Center";
        Build(firstTownCenter.name);
        EmpireGame.Engine.townCenterArray.add(firstTownCenter);
    }

    public static void initialCreationVillagers(){
        System.out.println("Creating 4 founder villagers.\n");
        for(int i = 0; i < 4; i++){
            CreateActions.createVillager();
        }
    }

    /*================
      Generic Actions
     ================*/
    public static void Build(String building_built) {
        System.out.println(building_built + " has been built.");
    }

    public static void createVillager() {
        Npc.Villager newVillager = new Npc.Villager();
        newVillager.number = EmpireGame.Engine.villagersArray.size() + 1;
        EmpireGame.Engine.villagersArray.add(newVillager);
        if (newVillager.gender.equals("female")) {
            System.out.println("A new villager was born and raised.\nHer name is " + newVillager.nickname + ". She is villager number " + newVillager.number + ".");
        }

        if (newVillager.gender.equals("male")) {
            System.out.println("A new villager was born and raised.\nHis name is " + newVillager.nickname + ". He is villager number " + newVillager.number + ".");
        }

    }
    public static void createTownCenter() {
        Buildings.Town_Center newTownCenter = new Buildings.Town_Center();
        newTownCenter.number = EmpireGame.Engine.townCenterArray.size();
        newTownCenter.name = newTownCenter.number + " Town Center";
        EmpireGame.Engine.townCenterArray.add(newTownCenter);
    }
}
