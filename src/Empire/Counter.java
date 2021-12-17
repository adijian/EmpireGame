package Empire;

public class Counter {
    public static long honey = 0;
    public double farmersGatherBatch = 7.5;
    public int farmersGatheringDelay = 60000;
    public double farmersSpeedModifier = 0.1;

    public void setHoney(int honeyNewNumber) {
        honey += honeyNewNumber;
    }

    public void main () {
        Thread t1 = new Thread(new Counter().new RunnableImpl());
        if (honey>0) {
            t1.start();
        }
    }

    private class RunnableImpl implements Runnable {

        public void run() {
            while (true) {
                try {
                    setHoney((int) (EmpireGame.Engine.villagersFarmingArray.size() * farmersGatherBatch));
                    System.out.println(
                                    "\nnumber of villagers * farmersGatherBatch" +
                                    "\nHoney set to: " + honey +
                                    "\nfarmersGatherBatch: " + farmersGatherBatch +
                                    "\nfarmersSpeedModifier: " + farmersSpeedModifier +
                                    "\nfarmersGatheringDelay:  " + farmersGatheringDelay);
                    EmpireGame.GameRun.coffersPanelUpdate();

                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    System.out.println("\nfarmersGatheringDelay * farmersSpeedModifier");
                    Thread.sleep((long) (farmersGatheringDelay * farmersSpeedModifier));
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
