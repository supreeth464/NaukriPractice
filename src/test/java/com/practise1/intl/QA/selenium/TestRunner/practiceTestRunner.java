package com.practise1.intl.QA.selenium.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.practise1.intl.QA.selenium/Portal/practice1/Practise1.feature",
        glue = {"com.practise1.intl.QA.selenium.StepDefpractise", "com.practise1.intl.QA.selenium.Hooks"},
        tags = "@practice1",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true
)
public class practiceTestRunner {
}
