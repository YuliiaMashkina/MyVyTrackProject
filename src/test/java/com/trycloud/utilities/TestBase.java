package com.trycloud.utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    /*
    This class is meant to be a super class
    to provide driver set up and closing browser
    for its subclasses


    // Now you can try to replace driver with
 * Driver.getDriver() so it can be same driver everywhere wherever you use
     */

    protected WebDriver driver ;
    @BeforeEach
    public void setupWebDriver(){
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver = Driver.getDriver();//OR //WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* This is how we can set maximum timeout for finding element
         in this example it will wait for 10 seconds
         if element is found in 1 second ,it will just move on without finishing 10 seconds
        // Thread.sleep(100000) will always wait for 10 seconds no matter what.*/
    }

    @AfterEach
    public void closeBrowser(){
        // driver.quit();
        Driver.closeBrowser();
    }

}
