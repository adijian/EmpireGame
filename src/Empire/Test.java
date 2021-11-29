package Empire;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static List<Villager> villagersArray = new ArrayList<>();
    public static List<Villager> villagersWoodcuttingArray = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("Hello World");
        Villager villager = new Villager();
        villager.job = "job";
        System.out.println(Test.arrayManipulation());
    }

    public static int arrayManipulation(){
        for (Villager d : Test.villagersArray){
            if(d.getJob() != null && d.getJob().contains("")){

            }
            //something here
        }
        return Test.villagersWoodcuttingArray.size();
    }

    static class Villager {
        int number;
        int hp = 20;
        String name;
        String job = " ";
        public String getJob() {
            return this.job;
        }
    }
}
