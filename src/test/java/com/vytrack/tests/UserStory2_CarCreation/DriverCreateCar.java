package com.vytrack.tests.UserStory2_CarCreation;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DriverCreateCar extends TestBase {

    @Test
    public void truckDriver1creteCar() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();

        //List <WebElement> createCars = driver.findElements(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        //Assertions.assertTrue(createCars.size()==0);
        Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"), 10));
    }

    @Test
    public void truckDriver2creteCar() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();

        Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"), 10));   }

    @Test
    public void truckDriver3creteCar() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driversGoToVehicles();

        Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"), 10));
    }
}
