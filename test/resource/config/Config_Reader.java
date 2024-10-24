package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.qa.AutomationExercise.page.Registeration_page_2;

public class Config_Reader {
    
    Properties prop;


    // Constructor: Initialize properties in the constructor
    public Config_Reader() {
    prop = init_Prop();
    }

    // Method to initialize the properties file
    public Properties init_Prop() {
        Properties prop = new Properties();
        try {
            // Make path flexible by using System.getProperty("user.dir")
            String configFilePath = System.getProperty("user.dir") + "/src/test/resource/config/config.properties";
            FileInputStream ip = new FileInputStream(configFilePath);
            prop.load(ip);
        } catch (FileNotFoundException e) {
            System.out.println("Config file not found at: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error loading the config file: " + e.getMessage());
        }
        return prop;
    }    
    
    // Method to get the selected browser from the properties file
    public String browser_Cfg() {
        String browser_selected = prop.getProperty("browser");
        if (browser_selected != null) {
            System.out.println("Browser selected: " + browser_selected);
            return browser_selected;
        } else {
            System.out.println("No browser selected in the config file.");
            return ""; // Handle missing browser config
        }
    }

    // Method to get the URL from the properties file
    public String url_Cfg() {
        String url_selected = prop.getProperty("url");
        if (url_selected != null) {
            System.out.println("URL selected: " + url_selected);
            return url_selected;
        } else {
            System.out.println("No URL selected in the config file.");
            return ""; // Handle missing URL config
        }
    }
 //**********************Registration Page****************************
    public String getuser_password() {
    return  prop.getProperty("user_password");
    }
    
    public String getFirstName() {
        return prop.getProperty("first_name");
    }

    public String getLastName() {
        return prop.getProperty("last_name");
    }

    public String getCompany() {
        return prop.getProperty("company");
    }

    public String getAddress1() {
        return prop.getProperty("address1");
    }

    public String getAddress2() {
        return prop.getProperty("address2");
    }

    public String getState() {
        return prop.getProperty("state");
    }

    public String getCity() {
        return prop.getProperty("city");
    }

    public String getZipcode() {
        return prop.getProperty("zipcode");
    }

    public String getMobileNumber() {
        return prop.getProperty("mobile_number");
    }

    public String getDay() {
        return prop.getProperty("2");
    }

    public String getMonth() {
        return prop.getProperty("month");
    }

    public String getYear() {
        return prop.getProperty("year");
    }
}
