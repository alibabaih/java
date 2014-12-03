package lesson_3_threads;

//how build threads

public class ThreadExample {
    public static void main(String[] args) {

        ThreadShower1 t = new ThreadShower1();
        t.start();
        try {
            Thread.sleep(3000);//through 3 sec. will stop
        } catch (InterruptedException e) {
            e.printStackTrace();
            t.stopShow();
        }
        t.stopShow();

    }
}
