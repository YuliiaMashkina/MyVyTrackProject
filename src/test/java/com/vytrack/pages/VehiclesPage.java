package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehiclesPage {

    @FindBy (xpath = "//span[@class='title title-level-1' and normalize-space(.)='Fleet']")
    public WebElement fleetModule;

    @FindBy (xpath = "//span[@class='title title-level-2' and normalize-space(.)='Vehicles']")
    public WebElement vehicleModule;

    @FindBy (xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCar;

    //fillup Form Elements
    @FindBy (name ="custom_entity_type[Driver]")
    public WebElement driver;

    @FindBy (name ="custom_entity_type[Location]")
    public WebElement location;

    @FindBy (name ="custom_entity_type[ModelYear]")
    public WebElement modelYear;

    @FindBy (xpath = "(//button[@type='submit' and normalize-space(.)='Save and Close'])[1]")
    public WebElement saveBtn;

    @FindBy (xpath = "//div/button/input[@type='checkbox']")
    public WebElement selectAllCheckBox;

    @FindBy (xpath = "//div[@class='other-scroll-container']//input")
    public List<WebElement> eachCheckBox;


    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    public void managersGoToVehicles(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).pause(1000)
                .moveToElement(vehicleModule).pause(1000)
                .click().perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("All"));
    }
    public void driversGoToVehicles(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).pause(1000)
                .moveToElement(vehicleModule).pause(1000)
                .click().perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleContains("Car"));
    }



    public void createCar(){
        managersGoToVehicles();
        createCar.click();
        BrowserUtils.waitFor(2);
        createCarForm();
        saveBtn.click();
    }


    public void createCarForm(){
        Faker faker = new Faker();
        driver.sendKeys(faker.name().fullName());
        location.sendKeys(faker.country().capital());
        modelYear.sendKeys(""+faker.number().numberBetween(2000,2020));

    }

    public boolean allSelected(){
        boolean result = false;
        List<WebElement> allCheckBoxes = Driver.getDriver().findElements(By.xpath("//div[@class='other-scroll-container']//input"));
        for (WebElement each : allCheckBoxes) {
            if (!each.isSelected()){
                break;
            }else
                result=true;
        }
        return result;
    }

    /*public boolean clickCheckBox(int a) {
        boolean result=false;
        List<WebElement> allCheckBoxes = Driver.getDriver().findElements(By.xpath("(//div[@class='other-scroll-container']//input)"));
        for (int i = 0; i < allCheckBoxes.size(); i++) {
            if (allCheckBoxes.get(i).equals(allCheckBoxes.get(a))) {
                allCheckBoxes.get(i).click();
                result= allCheckBoxes.get(i).isSelected();
            }
        }
        return result;
    }*/

    public void clickCheckBox(int a) {
    eachCheckBox.get(a).click();
    }

}
