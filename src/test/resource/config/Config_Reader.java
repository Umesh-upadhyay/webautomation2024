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
            String configFilePath = System.getProperty("user.dir") + "./src/test/resource/config/config.properties";
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
    
    public boolean isHeadless() {
        return Boolean.parseBoolean(prop.getProperty("headless", "false"));
    }
 // Method to get the signup name
    public String getSignupName() {
        return prop.getProperty("Name_signup"); // Default value in case of missing property
    }

    // Method to get the signup email
    public String getSignupEmail() {
        return prop.getProperty("Email_signup");
    }
//****************registeration page********************
    
   
    public String getUserPassword() {
        return prop.getProperty("user_password", "defaultPassword");
    }

 
    public String getFirstName() {
        return prop.getProperty("first_name", "Default First Name");
    }

    public String getLastName() {
        return prop.getProperty("last_name", "Default Last Name");
    }

    public String getCompany() {
        return prop.getProperty("company", "Default Company");
    }

    public String getAddress1() {
        return prop.getProperty("address1", "Default Address 1");
    }

    public String getAddress2() {
        return prop.getProperty("address2", "Default Address 2");
    }

    public String getState() {
        return prop.getProperty("state", "Default State");
    }

    public String getCity() {
        return prop.getProperty("city", "Default City");
    }

    public String getZipcode() {
        return prop.getProperty("zipcode", "000000");
    }

    public String getMobileNumber() {
        return prop.getProperty("mobile_number", "0000000000");
    }

    public String getBirthDay() {
        return prop.getProperty("day", "1");
    }

    public String getBirthMonth() {
        return prop.getProperty("month", "January");
    }

    public String getBirthYear() {
        return prop.getProperty("year", "2000");
    }

    
    
    
//***************** payment page details******************************************
    public String getCardHolderName() {
        return prop.getProperty("Card_holder_name", "Default Card Holder");
    }

    public String getCardNumber() {
        return prop.getProperty("Card_number", "0000000000000000");
    }

    public String getCvvNumber() {
        return prop.getProperty("Cvv_number", "000");
    }

    public String getPaymentMonth() {
        return prop.getProperty("Month", "01"); // Default to January
    }

    public String getPaymentYear() {
        return prop.getProperty("Year", "2023"); // Default to current year
    }

   
 
}
