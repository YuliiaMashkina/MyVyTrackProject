package com.vytrack.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class test extends TestBase {

    @Test
    public void checkLogin(){
        LoginPage login = new LoginPage();
        login.goTo();
        login.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));

        BrowserUtils.waitFor(3);
    }
}
