package lesson_2_singleton;

public class Settings {
    //lazy sigleton
    public static final Settings INSTANCE = new Settings();

    private static String gameName;

    //for not lazy singleton need to write getter
    public static Settings getInstance() {
        return Settings.INSTANCE;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    private Settings() {
        System.out.println("In settings ");
    }
}
