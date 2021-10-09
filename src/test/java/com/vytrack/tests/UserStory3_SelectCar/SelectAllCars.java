package com.vytrack.tests.UserStory3_SelectCar;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectAllCars extends TestBase {

    @Test
    public void storeManager1SelectCar(){
    LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

    VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
       BrowserUtils.waitFor(2);
       Assertions.assertTrue(vehiclesPage.allSelected());
  }

    @Test
    public void storeManager2SelectCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
        BrowserUtils.waitFor(2);
        Assertions.assertTrue(vehiclesPage.allSelected());
    }

    @Test
    public void storeManager3SelectCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
        BrowserUtils.waitFor(2);
        Assertions.assertTrue(vehiclesPage.allSelected());
    }

    @Test
    public void salesManager1SelectCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
        BrowserUtils.waitFor(2);
        Assertions.assertTrue(vehiclesPage.allSelected());
    }

    @Test
    public void salesManager2SelectCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
        BrowserUtils.waitFor(2);
        Assertions.assertTrue(vehiclesPage.allSelected());
    }

    @Test
    public void salesManager3SelectCar(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managersGoToVehicles();
        BrowserUtils.waitFor(2);

        vehiclesPage.selectAllCheckBox.click();
        BrowserUtils.waitFor(2);
        Assertions.assertTrue(vehiclesPage.allSelected());
    }

    @Test
    public void truckDriver1selectCar() {
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
    public void truckDriver2selectCar() {
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
    public void truckDriver3selectCar() {
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
3. Story: As a user, I should be to select any vehicle/car from vehicle page
AC #1: user can select all the cars by checking the first checkbox
Given user is on the homePage
When user select “Vehicles” under Fleet module
And user checks the first checkbox
Then verify all the checkbox is checked
 */