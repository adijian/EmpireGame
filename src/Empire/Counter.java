package Empire;

import java.util.concurrent.TimeUnit;

public class Counter {
    public static long logs = 1;
    public static int woodcutters = 2;
    public int woodcuttersGatheringTime = 60000;
    public double woodcuttersTimeModifier = 0.01;
    public double GatheringSpeedmodifier = 1.1;

    public void setLogs(int logsNewNumber) {
        logs = logsNewNumber;
    }

    public static void main () throws InterruptedException {
        Thread t1 = new Thread(new Counter().new RunnableImpl());
        t1.start();
        Counter.woodcuttersIncrement();
    }

    public static void woodcuttersIncrement() throws InterruptedException {
        for(int i = 0; i<500; i++) {
            woodcutters += 1;
            TimeUnit.SECONDS.sleep(20);
        }
    }

    private class RunnableImpl implements Runnable {

        public void run() {
            while (true) {
                try {
                    int logsAccumulated = (int) (logs + (woodcutters * GatheringSpeedmodifier));
                    setLogs(logsAccumulated);
                    System.out.println("logs set to: " + logsAccumulated);
//                    GUI.coffersPanel();
                    EmpireGame.GameRun.coffersPanelUpdate();

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
}
