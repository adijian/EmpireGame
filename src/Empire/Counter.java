package Empire;

public class Counter {
    public static long honey = 0;
    public int farmersGatheringTime = 60000;
    public double farmersGatherBatch = 7.5;
    public double farmersTimeModifier = 0.1;
    public double gatheringSpeedmodifier = 0.50;
    public static Thread t1;

    public void setHoney(int honeyNewNumber) {
        honey += honeyNewNumber;
    }

    public static void main () {
        Thread t1 = new Thread(new Counter().new RunnableImpl());
        t1.start();
    }

    private class RunnableImpl implements Runnable {

        public void run() {
            while (Counter.t1 != null) {
                try {
                    setHoney((int) (EmpireGame.Engine.villagersFarmingArray.size() * farmersGatherBatch * gatheringSpeedmodifier));
                    System.out.println(
                                    "EmpireGame.Engine.villagersFarmingArray.size() * farmersGatherBatch * gatheringSpeedmodifier)" +
                                    "\nHoney set to: " + honey +
                                    " \nfarmersGatherBatch: " + farmersGatherBatch +
                                    " \ngatheringSpeedmodifier: " + gatheringSpeedmodifier +
                                    " \nfarmersTimeModifier: " + farmersTimeModifier +
                                    " \nfarmersGatheringtime:  " + farmersGatheringTime);
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
}
