package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected AppiumDriver appiumDriver;

    public BasePage(AppiumDriver driver) {
        this.appiumDriver = driver;
    }

    protected void waitForVisibilityOf(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(appiumDriver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected boolean isElementPresent(By by) {
        try {
            appiumDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void printLog(String message) {
        System.out.println(message);
    }


}
