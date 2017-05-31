package com.ericsoon.pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Vadym on 5/29/2017.
 */
public abstract class MainPage extends AbstractMainPageWrapper implements VerifyPageIsLoaded {

    public WebDriver webDriver;

    public SelenideElement
            menuMain = $("a[href='https://dou.ua/']"),
            menuForum = $("a[href='https://dou.ua/forums/"),
            menuLenta = $("a[href='https://dou.ua/lenta/");

    protected SelenideElement
            login = $("a#login-link"),
            search = $("input#txtGlobalSearch");

    MainPage() {
        //this.webDriver = driver;
        waitUntilPageIsLoaded();
    }


}
