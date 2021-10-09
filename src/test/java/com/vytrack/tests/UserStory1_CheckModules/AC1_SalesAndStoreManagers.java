package com.vytrack.tests.UserStory1_CheckModules;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC1_SalesAndStoreManagers extends TestBase {

    @Test
    public void storeManager1testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void storeManager2testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void storeManager3testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void salesManager1testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void salesManager2testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void salesManager3testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        List <WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities",
                "Marketing","Reports & Segments","System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==8);
        Assertions.assertEquals(expectedModules,actualModules);
    }


}
/*
1. Story: As a user, I should be access all the main modules of the app.
AC #1:
Given store/sales manager is on the homePage
Then verify user view 8 models names [verify the names]


AC #2:
Given driver is on the homePage
Then verify user view 4 models names [verify the names]
 */