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

public class AC2_Driver extends TestBase {

    @Test
    public void truckDriver1testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==4);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void truckDriver2testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==4);
        Assertions.assertEquals(expectedModules,actualModules);
    }

    @Test
    public void truckDriver3testModules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));

        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System" ));
        ArrayList<String> actualModules = new ArrayList<>();

        for (WebElement element : modules) {
            actualModules.add(element.getText());
        }
        Assertions.assertTrue(modules.size()==4);
        Assertions.assertEquals(expectedModules,actualModules);
    }
}
