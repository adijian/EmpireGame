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
        public static ArrayList<Npc.Villager> villagersArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersWoodcuttingArray = new ArrayList<Npc.Villager>();
        public static ArrayList<Npc.Villager> villagersFarmingArray = new ArrayList<Npc.Villager>();
        public static ArrayList<Npc.Villager> villagersMiningArray = new ArrayList<Npc.Villager>();
        public static ArrayList<Npc.Villager> villagersBuildingArray = new ArrayList<Npc.Villager>();

    public static void gameStart(){
        CreateActions.initialCreationVillagers();
    }
}

    /*================
      ~ Main Loop    ~
     ================*/
    public static GUI GameRun;

    public static void main(String[] args) {
        GameRun = new GUI();
        EmpireGame.Engine.gameStart();
    }

}