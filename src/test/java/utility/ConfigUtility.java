package utility;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtility {

    File file;
    FileInputStream fileInputStream;
    Properties properties;

    public ConfigUtility() throws IOException {
        String path = System.getProperty("user.dir") + "\\Configuration\\Config.properties";
        file = new File(path);
        fileInputStream = new FileInputStream(file);
        properties = new Properties();
        properties.load(fileInputStream);
    }

    public static void main(String[] args) throws IOException {
        ConfigUtility configUtility = new ConfigUtility();
        System.out.println(configUtility.getBrowserName());
        System.out.println(configUtility.getUrl());
    }

    public String getBrowserName() {
        return properties.getProperty("browser");
    }

    public String getUrl() {
        return properties.getProperty("url");
    }





}
