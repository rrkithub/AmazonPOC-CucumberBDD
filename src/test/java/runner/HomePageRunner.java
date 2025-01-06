package runner;

import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions( tags = {"@AmzaonSecondHighestPriceTV"},glue = {"stepdefs"}, plugin = {"html:target/cucumber-reports/HomePage/cucumber-pretty","json:target/json-cucumber-reports/homepage/cukejson.json",
		"testng:target/testng-cucumber-reports/HomePage/cuketestng.xml" }, features = {"src/test/resources/features/HomePage"})
public class HomePageRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	public static void before() {
		System.out.println("Before - "+System.currentTimeMillis());
	}

	@AfterClass
	public static void after() {
		System.out.println("After - "+System.currentTimeMillis());
	}


	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
