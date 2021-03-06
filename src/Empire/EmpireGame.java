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

        public static ArrayList<Buildings.Town_Center> townCenterArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersWoodcuttingArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersFarmingArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersMiningArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villagersBuildersArray = new ArrayList<>();
        public static ArrayList<Npc.Villager> villlagersScholarsArray = new ArrayList<>();

    public static void gameStart(){
        // Game begins with 4 villagers
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
        Counter.mainHoney();
        Counter.mainGold();
        Counter.mainMaple();
        Counter.mainIntellect();
    }
}