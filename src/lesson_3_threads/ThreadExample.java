package lesson_3_threads;

//how build threads

public class ThreadExample {
    public static void main(String[] args) {
        //how to #1
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("hello thread");
            }
        };
        t.start();
        //how to #2
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2");
            }
        });
        t.start();// set up thread
        System.out.println("hello");
    }
}
//6 minute http://hexlet.org/lesson/java_102_3/