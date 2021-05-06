package com.test.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"src/test/resources/runnablefeatures"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = "stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider (parallel = true) 
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
