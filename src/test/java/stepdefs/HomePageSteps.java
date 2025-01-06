package stepdefs;

import java.io.IOException;
import java.util.Random;

import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import ApplicationPages.Homepage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.*;

public class HomePageSteps extends webconnector {
    private Homepage homePage;
	private String scenDesc;

    public HomePageSteps() {
        this.homePage = new Homepage();
    }

    

	@BeforeStep
	public void beforeStep() throws InterruptedException {
		Thread.sleep(2000);
	}

    @Given("^User navigates to QATechTesting HomePage$")
    public void aUserNavigatesToHomePage() throws InvalidFormatException, IOException {
        this.homePage.goToHomePage();
    }
    @Given("^User navigates to Amazon app URL")
    public void aUserNavigatesToURL() throws InvalidFormatException, IOException {
        this.homePage.goToHomePage();
    }
    
    @When("I enter {string} text in {string} field")
    public void inputText(String txt, String element) throws InvalidFormatException, Exception {
        this.homePage.inputText(element,txt);
        Thread.sleep(2000);
    }
    @When("I enter Random text in {string} field")
    public void inputRandomText(String element) throws InvalidFormatException, Exception {
        this.homePage.inputText(element,getSaltString());
        Thread.sleep(2000);
    }
    @When("I click on {string} link")
    public void clickLink(String element) throws InvalidFormatException, IOException {
        this.homePage.clickButton(element);
    }
    @When("I click on {string} button")
    public void clickButton(String element) throws InvalidFormatException, IOException {
        this.homePage.clickButton(element);
    }
    @And("I click on {string} checkbox")
    public void clickCheckbox(String element) throws InvalidFormatException, IOException {
        this.homePage.clickButton(element);
    }
    @When("I click on {string} button if exists")
    public void clickButtonifExists(String element) throws InvalidFormatException, IOException {
        this.homePage.clickButton(element);
    }
    @When("verify {string} element presence")
    public void checkifElementExist(String element) throws InvalidFormatException, IOException {
        this.homePage.isElementExist(element);
    }
    @When("log the {string} element description to report and console")
    public void logElementDescrition(String element) throws InvalidFormatException, IOException {
        this.homePage.getElementDescrition(element);
    }
    @And("I scroll to {string} element")
    public void scrollToElement(String element) throws InvalidFormatException, IOException {
        this.homePage.scrollToWebElement(element);
    }
    @Then( "I close the current window")
    public void closeCurrentWindow() throws InvalidFormatException, IOException {
        this.homePage.closeCurrentWindowScreen();
    }
    @Then("^User verify that Blog Link is displayed$")
    public void googleLogoIsDisplayed() throws Exception {
        this.homePage.checkBlogLinkDisplayIfExists();
    }
    @Then("^Switch to next window$")
    public void swichWindow() throws Exception {
        this.homePage.switchToNextWindow();
    }
    
    @Then("I select the {string} value from {string} Dropdown")
    public  void selectDropDown(String val, String dropdown){
        this.homePage.selectText(dropdown,val);
    }
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
