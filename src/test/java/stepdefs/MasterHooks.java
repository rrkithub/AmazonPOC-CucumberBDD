package stepdefs;

import WebConnector.DriverFactory;
import WebConnector.webconnector;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MasterHooks extends DriverFactory {
WebDriver driver;
webconnector wc=new webconnector();

    @After
    public void tearDownAndScreenshotOnFailure(Scenario scenario) {
        wc.closeDriver(scenario);
    }
}