package lesson_2_singleton;
//non-lazy singleton
public class SettingsInstanceHolder {
    static Settings INSTANCE = new Settings();

    private SettingsInstanceHolder() {}
}
