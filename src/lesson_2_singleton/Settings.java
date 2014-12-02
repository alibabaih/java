package lesson_2_singleton;

public class Settings {
    //non-lazy sigleton
    //public static Settings INSTANCE = null;

    private static final String GAME_NAME = "mario";

    private int playersCount;

    //for not lazy singleton need to write getter
    public static Settings getInstance() {
//        if (INSTANCE == null){
//            INSTANCE = new Settings();
//        }
        return SettingsInstanceHolder.INSTANCE;
    }

    public static String getGameName() {
        return GAME_NAME;
    }

     Settings() {
        System.out.println("In settings ");
    }

    //instead SettingsInstanceHolder.java
    public static class SettingsInstanceHolder {

        private static Settings INSTANCE = new Settings();

        private SettingsInstanceHolder() {}

    }
}
