package com.ericsoon.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Vadym on 5/31/2017.
 */
public class HomePage extends MainPage {

    private final LoginPopUp loginPopUp;

    private SelenideElement
            firstJob = $("ul.b-index-links > li:nth-child(1) > a"),
            kareraVit = $("ul.b-index-links > li:nth-child(2) > a"),
            runokTruda = $("ul.b-index-links > li:nth-child(3) > a:nth-child(1)"),
            obrazovanie = $("ul.b-index-links > li:nth-child(3) > a:nth-child(2)");

    public SelenideElement
            imgpProfile = $("img[alt='Вадим Шевченко']");

    public HomePage() {
       // super(driver);
        this.loginPopUp = new LoginPopUp();
    }

    public void waitUntilPageIsLoaded() {
        $(login).waitUntil(visible, 20000);
        System.out.println("test");
    }

    public HomePage searchSomething(String text){
        $(search).setValue(text).pressEnter();
        return this;
    }

    public HomePage signInByEmail(String email, String password){
        $(login).click();
        $(loginPopUp.loginByEmail).click();
        $(loginPopUp.username).setValue(email);
        $(loginPopUp.password).setValue(password);
        $(loginPopUp.confirmButton).click();
        $(loginPopUp.confirmButton).waitUntil(disappear, 5000);
        return this;
    }


}
