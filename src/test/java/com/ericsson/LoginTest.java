package com.ericsson;

import com.codeborne.selenide.Condition;
import com.ericsoon.pageobject.HomePage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Vadym on 5/31/2017.
 */
public class LoginTest extends BaseTest{


    @DataProvider
    public Object[][] credentials() {
        return new Object[][]{
                {"spawnihome@ua.fm", "xxxx"},
        };
    }

    @Test(dataProvider = "credentials")
    public void ValidSignIn(String username, String password){
        HomePage homePage = new HomePage();
        homePage.searchSomething("testSearch");
        $(homePage.imgpProfile).shouldNotBe(Condition.visible);
        homePage.signInByEmail(username, password);
        $(homePage.imgpProfile).shouldBe(Condition.visible);
    }

}
