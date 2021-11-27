package Empire;

/*================
    Buildings
================*/

public class Buildings {

    public static class Town_Center {
        int hp = 120;
        public int number;
        public String name = " ";

        void createVillagerFromTownCenter() {
            CreateActions.createVillager();
        }
    }
}
