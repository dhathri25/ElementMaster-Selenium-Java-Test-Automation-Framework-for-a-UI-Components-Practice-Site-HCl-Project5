package com.automation.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    static {
        try {
            String path = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            FileInputStream fis = new FileInputStream(path);

            prop = new Properties();
            prop.load(fis);
            

            System.out.println("Config loaded successfully");

        } catch (Exception e) {
            System.out.println("Failed to load config file");
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}