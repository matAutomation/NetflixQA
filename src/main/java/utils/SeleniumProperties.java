package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SeleniumProperties {
    private Properties properties;

    public SeleniumProperties() {
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src\\main\\helpers\\config.properties");

            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPropertyValue(String key) {
        return properties.getProperty(key);
    }

}
