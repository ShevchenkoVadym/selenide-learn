package com.ericsson;

import org.testng.annotations.*;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.close;

/**
 * Created by Vadym on 5/31/2017.
 */
public class BaseTest {

    @BeforeSuite
    public void setUp() {
        timeout = 10000;
        browser = "chrome";
        baseUrl = "https://dou.ua";
        startMaximized = true;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @BeforeMethod
    public void openHomePage(){
        open("/");
    }

    @AfterSuite
    public void tearDown() {
        close();
    }

}
