package com.trycloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtils {

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static boolean checkVisibilityOfElement(By locator, int second) {
/** * This method will check for visibility of element within the time given
 * @param locator By.id or By.xpath or By.whatever
 * @param second time to wait
 * @return true if the element is found within the time and visible , false if not */

        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), second);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result = true;
        } catch (TimeoutException e) {
           //System.out.println(e.getMessage());
            System.out.println("We did not find the element");
        }

        return result;
    }
}
