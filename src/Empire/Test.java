package Empire;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static ArrayList<Villager> villagersArray = new ArrayList<Villager>();
    public static ArrayList<Villager> villagersWoodcuttingArray = new ArrayList<Villager>();

    public static void main(String[] args){
        System.out.println("Hello World");
        Villager villager1 = new Villager();
        villagersArray.add(villager1);
        villager1.job = "job";
        Villager villager2 = new Villager();
        villagersArray.add(villager2);
        Villager villager3 = new Villager();
        villagersArray.add(villager3);
        System.out.println(Test.arrayManipulation(villager1));
        System.out.println(villagersWoodcuttingArray);
        System.out.println(villagersArray);
    }

    public static int arrayManipulation(Villager villager){
        try {
            for (Villager d : Test.villagersArray) {
                if (d.getJob(villager).equals("job")) {
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

    class Villager {
        int number;
        int hp = 20;
        String name;
        String job = " ";
        public String getJob(Villager villager) {
            return villager.job;
        }
    }

