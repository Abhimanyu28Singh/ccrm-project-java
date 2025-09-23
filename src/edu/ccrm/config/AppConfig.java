package edu.ccrm.config;

// Singleton
public class AppConfig {
    private static AppConfig instance;
    private String dataPath = "test-data";

    private AppConfig() {}

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public void load() {
        System.out.println("AppConfig loaded. Data folder: " + dataPath);
    }

    public String getDataPath() {
        return dataPath;
    }
}
