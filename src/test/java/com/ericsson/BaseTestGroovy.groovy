package com.ericsson

import com.codeborne.selenide.Condition
import com.ericsoon.pageobject.HomePage
import spock.lang.Specification
import spock.lang.Title

import static com.codeborne.selenide.Configuration.baseUrl
import static com.codeborne.selenide.Configuration.browser
import static com.codeborne.selenide.Configuration.startMaximized
import static com.codeborne.selenide.Configuration.timeout
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$

/**
 * Created by Vadym on 6/1/2017.
 */

class BaseTestGroovy extends Specification{

    def setupSpec() {
        timeout = 10000
        browser = "chrome"
        baseUrl = "https://dou.ua"
        startMaximized = true
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe")
    }

    def "valid sign in to the website"() {
        setup:
            def homePage = new HomePage()
        when:
            homePage.signInByEmail(username, password)
        then:
            $(homePage.imgpProfile).shouldBe(Condition.visible)
        where:
                    username       | password
                "spawnihome@ua.fm" | "spider"
    }

}
