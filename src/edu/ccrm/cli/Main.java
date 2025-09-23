package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        // Load singleton config
        AppConfig.getInstance().load();
        // Start menu
        Menu menu = new Menu();
        menu.start();
    }
}


