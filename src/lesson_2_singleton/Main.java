package lesson_2_singleton;

public class Main {

    public static void main(String[] args) {
        // for forbid to do so: Settings mySettings = new Settings();
        //we make privet constructor
        System.out.println("line1");
        testSingleton();
        System.out.println("line2");
    }

    private static void testSingleton() {
        System.out.println(Settings.getGameName());

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Settings.getInstance();
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Settings.getInstance();
//            }
//        });
//        t1.start(); t2.start();

    }

}
