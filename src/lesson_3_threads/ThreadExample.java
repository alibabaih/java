package lesson_3_threads;

//how build threads

public class ThreadExample {
    public static void main(String[] args) {
        //how to #1
        Thread t = new Thread("Hello thread"){ //it is better to named thread for debugging

            @Override
            public void run() {
                System.out.println("hello thread");
                Integer a = null;
                a++;
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

        System.out.println("hello");
        t.start();// set up thread
        //t.stop(); you should create method which will stop the thread

    }
}
//6 minute http://hexlet.org/lesson/java_102_3/