package lesson_3_threads;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("hello thread");
            }
        };
        t.start();
    }
}