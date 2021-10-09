package com.vytrack.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.jvm.hotspot.debugger.Page;

public class LoginPage {

    @FindBy (id = "prependedInput")
    private WebElement usernameBox;

    @FindBy (id ="prependedInput2")
    private WebElement passwordBox;

    @FindBy (id ="_submit")
    private WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void login(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
    }




}
