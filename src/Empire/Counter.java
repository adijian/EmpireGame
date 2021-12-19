package Empire;

public class Counter {
    public static long honey = 0;
    public int farmersGatheringTime = 60000;
    public double farmersGatherBatch = 7.5;
    public double farmersTimeModifier = 0.1;
    public double farmersGatheringSpeedmodifier = 0.50;

    public void setHoney(int honeyNewNumber) {
        honey += honeyNewNumber;
    }

    public static void mainHoney () {
        Thread HoneyCountingThread = new Thread(new Counter().new HoneyRunnable());
        HoneyCountingThread.start();
    }

    private class HoneyRunnable implements Runnable {

        public void run() {
            while (true) {
                try {
                    setHoney((int) (EmpireGame.Engine.villagersFarmingArray.size() * farmersGatherBatch * farmersGatheringSpeedmodifier));
                    System.out.println(
                                    "EmpireGame.Engine.villagersFarmingArray.size() * farmersGatherBatch * gatheringSpeedmodifier)" +
                                    "\nHoney set to: " + honey +
                                    "\nfarmersGatherBatch: " + farmersGatherBatch +
                                    "\ngatheringSpeedmodifier: " + farmersGatheringSpeedmodifier +
                                    "\nfarmersTimeModifier: " + farmersTimeModifier +
                                    "\nfarmersGatheringtime:  " + farmersGatheringTime);
                    EmpireGame.GameRun.coffersPanelUpdate();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println("farmersGatheringTime * farmersTimeModifier\n");
                    Thread.sleep((long) (farmersGatheringTime * farmersTimeModifier));
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static long gold = 0;
    public int minersGatheringTime = 60000;
    public double minersGatherBatch = 7.5;
    public double minersTimeModifier = 0.1;
    public double miningGatheringSpeedmodifier = 0.50;

    public void setGold(int goldNewNumber) {
        gold += goldNewNumber;
    }

    public static void mainGold () {
        Thread GoldCountingThread = new Thread(new Counter().new GoldRunnable());
        GoldCountingThread.start();
    }

    private class GoldRunnable implements Runnable {

        public void run() {
            while (true) {
                try {
                    setGold((int) (EmpireGame.Engine.villagersMiningArray.size() * minersGatherBatch * miningGatheringSpeedmodifier));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep((long) (minersGatheringTime * minersTimeModifier));
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static long maple = 0;
    public int woodcuttersGatheringTime = 60000;
    public double woodcuttersGatherBatch = 7.5;
    public double woodcuttersTimeModifier = 0.1;
    public double woodcuttersGatheringSpeedmodifier = 0.50;

    public void setMaple(int mapleNewNumber) {
        maple += mapleNewNumber;
    }

    public static void mainMaple () {
        Thread MapleCountingThread = new Thread(new Counter().new MapleRunnable());
        MapleCountingThread.start();
    }

    private class MapleRunnable implements Runnable {

        public void run() {
            while (true) {
                try {
                    setMaple((int) (EmpireGame.Engine.villagersWoodcuttingArray.size() * woodcuttersGatherBatch * woodcuttersGatheringSpeedmodifier));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep((long) (woodcuttersGatheringTime * woodcuttersTimeModifier));
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static long intellect = 0;
    public int scholarsGatheringTime = 60000;
    public double scholarsGatherBatch = 7.5;
    public double scholarsTimeModifier = 0.1;
    public double scholarsGatheringSpeedmodifier = 0.50;

    public void setIntellect(int intellectNewNumber) {
        intellect += intellectNewNumber;
    }

    public static void mainIntellect () {
        Thread IntellectCountingThread = new Thread(new Counter().new IntellectRunnable());
        IntellectCountingThread.start();
    }

    private class IntellectRunnable implements Runnable {

        public void run() {
            while (true) {
                try {
                    setIntellect((int) (EmpireGame.Engine.villlagersScholarsArray.size() * scholarsGatherBatch * scholarsGatheringSpeedmodifier));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep((long) (scholarsGatheringTime * scholarsTimeModifier));
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
