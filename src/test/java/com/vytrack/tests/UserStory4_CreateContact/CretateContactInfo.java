package com.vytrack.tests.UserStory4_CreateContact;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.CustomersContactPage;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CretateContactInfo extends TestBase {

    @Test
    public void storeManager1contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }


    @Test
    public void storeManager2contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }


    @Test
    public void storeManager3contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void salesManager1contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void salesManager2contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void salesManager3contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void truckDriver1contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void truckDriver2contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

    @Test
    public void truckDriver3contactCreation(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);

        CustomersContactPage contactPage = new CustomersContactPage();
        contactPage.usersGoToContacts();

        contactPage.createContactBtn.click();
        contactPage.fillTheForm();
        contactPage.saveAndCloseBtn.click();

        Assertions.assertTrue(contactPage.confirmationMsg.isDisplayed());
    }

}
