package com.demoqa.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.codeborne.selenide.Configuration;

public class Hooks {

    @Before
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}