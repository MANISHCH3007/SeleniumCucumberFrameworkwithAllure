package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="D:\\Seleniumjavaaselenium\\FunctionalSeleniumDucat\\src\\feature",
glue="stepDefinition",
dryRun= false,
tags="@Reg",
plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)


//plugin= {"pretty","io.qameta.allure.cucumber7Jvm"}



public class TestRunner extends AbstractTestNGCucumberTests{

}