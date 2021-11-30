package Empire;

public class Test implements Runnable {
    int numberOfVillagers = 3;
    int counter = 0;
    private int logs;
    int modifier = 15;

    @Override
    public void run() {
        while (counter < 1500){
            logs += (numberOfVillagers)*modifier;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
