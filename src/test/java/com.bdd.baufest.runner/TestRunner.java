package com.bdd.baufest.runner;

import com.bdd.baufest.utils.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.bdd.baufest.web.stepDefinition", "com.bdd.baufest.mobile.stepDefinition"},
        plugin = {"pretty", "html:target/cucumber"},
        tags = "@registroDemoblaze",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterTest
    public void quitDriver() {
        if (DriverFactory.webDriver != null) {
            DriverFactory.quitDriver();
            System.out.println("Driver quitted");
        }
    }
}
