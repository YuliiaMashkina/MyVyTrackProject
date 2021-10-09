package com.vytrack.tests.UserStory3_SelectCar;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SelectAnyCar extends TestBase {

    @Test
    public void storeManager1ClickCheckBox(){{
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
            BrowserUtils.waitFor(2);

            VehiclesPage vehiclesPage = new VehiclesPage();
            vehiclesPage.managersGoToVehicles();
            BrowserUtils.waitFor(2);

            vehiclesPage.clickCheckBox(4);
            Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
        }
    }

    @Test
    public void storeManager2ClickCheckBox() {
        {
            LoginPage loginPage = new LoginPage();
            loginPage.goTo();
            loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
            BrowserUtils.waitFor(2);

            VehiclesPage vehiclesPage = new VehiclesPage();
            vehiclesPage.managersGoToVehicles();
            BrowserUtils.waitFor(2);

            vehiclesPage.clickCheckBox(4);
            Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
        }
    }

    @Test
    public void storeManager3ClickCheckBox() {

                LoginPage loginPage = new LoginPage();
                loginPage.goTo();
                loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
                BrowserUtils.waitFor(2);

                VehiclesPage vehiclesPage = new VehiclesPage();
                vehiclesPage.managersGoToVehicles();
                BrowserUtils.waitFor(2);

                vehiclesPage.clickCheckBox(4);
                Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
            }

    @Test
    public void salesManager1ClickCheckBox() {

        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.clickCheckBox(4);
        Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
    }

    @Test
    public void salesManager2ClickCheckBox() {

        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.clickCheckBox(4);
        Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
    }

    @Test
    public void salesManager3ClickCheckBox() {

        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.clickCheckBox(4);
        Assertions.assertTrue(vehiclesPage.eachCheckBox.get(4).isSelected());
    }

    @Test
    public void truckDriver1clickCheckbox() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div[@class='other-scroll-container']//input"),6));
    }

    @Test
    public void truckDriver2clickCheckbox() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div[@class='other-scroll-container']//input"),6));
    }

    @Test
    public void truckDriver3clickCheckbox() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div[@class='other-scroll-container']//input"),6));
    }



}
    /*
AC #2: user can select any car
Given user is on the homePage
When user select “Vehicles” under Fleet module
And user checks any car’s checkbox
Then verify the checkbox is checked
 */