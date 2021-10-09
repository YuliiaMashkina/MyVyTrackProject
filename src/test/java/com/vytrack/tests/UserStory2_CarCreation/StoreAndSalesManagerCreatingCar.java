package com.vytrack.tests.UserStory2_CarCreation;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StoreAndSalesManagerCreatingCar extends TestBase {

    @Test
    public void storeManager1creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']

    }

    @Test
    public void storeManager2creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']

    }

    @Test
    public void storeManager3creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']

    }

    @Test
    public void salesManager1creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']

    }

    @Test
    public void salesManager2creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']
    }

    @Test
    public void salesManager3creteCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(2);
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(successMessage.isDisplayed());//div[@class='message' and .='Entity saved']

    }

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
