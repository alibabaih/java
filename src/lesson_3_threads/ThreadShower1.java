package lesson_3_threads;


public class ThreadShower1 extends Thread {

    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("hello thread!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    public void stopShow() {
        running = false;
    }

}
