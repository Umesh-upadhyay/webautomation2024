package com.qa.AutomationExercise.Utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.qa.AutomationExercise.exceptions.Browser_exception;

public class Eleutilnew {

    private WebDriver driver;
    private Actions act;
    private static final Logger log = LogManager.getLogger(Eleutilnew.class);
    private JavascriptExecutor js;
    
    // Constructor to initialize WebDriver and Actions
    public Eleutilnew(WebDriver driver) {
    this.driver = driver;
    act = new Actions(driver);
    js = ((JavascriptExecutor)driver);
      }

    // ******************** URL & Window Methods ***************************

    public void launchUrl(String url) {
        if (url == null || url.isEmpty() || (!url.startsWith("http://") && !url.startsWith("https://"))) {
            throw new Browser_exception("=== INCORRECT URL ===");
        } else {
            driver.get(url);
        }
    }
    
    public void current_Url() {
    String url= driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void minimizeWindow() {
        driver.manage().window().minimize();
    }

    public void quitDriver() {
        driver.quit();
    }

    // ******************** Element Interaction Methods ***************************

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public void dosendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public void sendKeys(By locator, CharSequence... value) {
        getElement(locator).sendKeys(value);
    }

    public void click(By locator) {
        getElement(locator).click();
    }

    public void submit(By locator) {
        getElement(locator).submit();
    }

    public String getText(By locator) {
        return getElement(locator).getText();
    }

    public String getAttribute(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public boolean isDisplayed(By locator) {
        try {
            return getElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Element is not present");
            return false;
        }
    }

    public boolean isEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public boolean isSelected(By locator) {
        return getElement(locator).isSelected();
    }

    public String fetchImageLink(By locator) {
        return getAttribute(locator, "src");
    }

    // ******************** Logging Methods ***************************

    public void logInfoMessage(String message) {
        log.info(message);
    }

    // ******************** Screenshot Methods ***************************

    public void takeScreenshot() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\KIMAYA\\screenshots\\fullpage.png");
        FileUtils.copyFile(src, dest);
    }

    
    public String captureScreenshot(WebDriver driver, String testName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/Screenshots/" + testName + ".png";
        File destination = new File(path);
        try {
            FileUtils.copyFile(src, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    // ******************** Dropdown Handling Methods ***************************

    public void selectByVisibleText(By locator, String visibleText) {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(visibleText);
    }

    public void selectByValue(By locator, String value) {
        Select select = new Select(getElement(locator));
        select.selectByValue(value);
    }

    public void selectByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public int getDropdownSize(By locator) {
        Select select = new Select(getElement(locator));
        return select.getOptions().size();
    }

    public void deselectByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.deselectByIndex(index);
    }

    // ******************** Mouse & Keyboard Actions Methods ***************************

    public void mouseHover(By locator) {
        act.moveToElement(getElement(locator)).perform();
    }

    public void dragAndDrop(By source, By destination) {
        act.dragAndDrop(getElement(source), getElement(destination)).perform();
    }

    public void doubleClick(By locator) {
        act.doubleClick(getElement(locator)).perform();
    }

    public void rightClick(By locator) {
        act.contextClick(getElement(locator)).perform();
    }
    
    public void pressTab() {
    Actions action = new Actions(driver);
    action.sendKeys(Keys.TAB).perform();;
    }
    
    // ********************Login_SignupPage***************************
    
    public void doSignup(String Name, String Email) {
    	
    }
    
    //***************** SCROOL DOWN **********************
    
    public void scroll_Down1(By Locator) throws InterruptedException {
	js.executeScript("arguments[0].scrollIntoView(true);",getElement(Locator));  // Pass the WebElement
	Thread.sleep(3000);
    }
    
    	public void scroll_Down(By locator) 
    	{
        js.executeScript("arguments[0].scrollIntoView(true);", getElement(locator));

      
    }
    
    
    // ******************** Miscellaneous Methods ***************************

    public void logout() {
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon'])[1]")).click();
        driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]")).click();
    }

    public String getElementText(By locator) {
        String text = getText(locator);
        if (text != null) {
            return text;
        } else {
            System.out.println("Element is not present");
            return null;
        }
    }

}
