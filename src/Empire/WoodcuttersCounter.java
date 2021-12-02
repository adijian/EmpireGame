package Empire;


import java.util.concurrent.TimeUnit;

public class WoodcuttersCounter {
    public long logs = 1;
    public static int woodcutters = 2;
    public int woodcuttersGatheringTime = 1000;
    public int woodcuttersTimeModifier = 1;
    public double modifier = 1.2;

    public void setLogs(int logsNewNumber) {
        logs = logsNewNumber;
    }
    public static void main (String[]args) throws InterruptedException {
        System.out.println("Main thread is- " + Thread.currentThread().getName());
        Thread t1 = new Thread(new WoodcuttersCounter().new RunnableImpl());
        t1.start();
        WoodcuttersCounter.woodcuttersIncrement();
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
                    int logsAccumulated = (int) (logs + (woodcutters * modifier));
                    setLogs(logsAccumulated);
                    System.out.println("logs set to: " + logsAccumulated);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep((long) (woodcuttersGatheringTime) * woodcuttersTimeModifier);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    modifier++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
