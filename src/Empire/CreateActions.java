package Empire;

public class CreateActions {
    public static void createVillager() {
        Npc.Villager newVillager = new Npc.Villager();
        newVillager.number = EmpireGame.Engine.villagersArray.size() + 1;
        EmpireGame.Engine.villagersArray.add(newVillager.nickname);
        if (newVillager.gender.equals("female")) {
            System.out.println("A new villager was born and raised.\nHer name is " + newVillager.nickname + ". She is villager number " + newVillager.number + ".");
        }

        if (newVillager.gender.equals("male")) {
            System.out.println("A new villager was born and raised.\nHis name is " + newVillager.nickname + ". He is villager number " + newVillager.number + ".");
        }

    }
}
