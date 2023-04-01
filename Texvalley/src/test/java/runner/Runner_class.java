package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\Texvalley\\src\\test\\resources\\featurefiles\\Exhibitor_Module.feature",
            glue="stepDefinitions",            
            plugin= {"pretty","html:target/cucumber-regression_report.html",
            		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish=true   )

public class Runner_class
{

	
}
