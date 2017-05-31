package com.ericsoon.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Vadym on 5/30/2017.
 */
public class LoginPopUp {

    public SelenideElement
            loginByEmail = $("a#_loginByMail"),
            password = $("input[name='password']"),
            username = $("input[name='username']"),
            confirmButton = $("div.row > div:nth-child(2) > button.big-button");

}
