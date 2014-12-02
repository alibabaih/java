package lesson_2_singleton;

public class Main {

    public static void main(String[] args) {
        // for forbid to do so: Settings mySettings = new Settings();
        //we make privet constructor
        System.out.println("line1");
        Settings mySettings = Settings.getInstance(); //was created instance settings
        mySettings.setGameName("game1");
        testSingleton();
        System.out.println("line2");
    }

    private static void testSingleton() {
        System.out.println(Settings.getInstance().getGameName());
    }

}
