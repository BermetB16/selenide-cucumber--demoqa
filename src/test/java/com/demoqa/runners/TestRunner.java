package com.demoqa.runners;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.demoqa.stepdefinitions")
public class TestRunner {
    // This class just needs to exist — Cucumber finds it automatically
}