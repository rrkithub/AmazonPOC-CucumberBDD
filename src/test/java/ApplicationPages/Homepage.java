package ApplicationPages;

import WebConnector.DriverFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import WebConnector.webconnector;
import org.openqa.selenium.WebDriver;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Homepage {
    webconnector wc = new webconnector();


WebDriver driver;
    public void goToHomePage() throws InvalidFormatException, IOException {
      wc.setUpDriver();
      driver= DriverFactory.get();
        String URL = wc.getSpecificColumnData("./src/test/testdata/data.xlsx", "sheet1", "URL");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(URL);
        wc.waitForCondition("PageLoad", "", 60);
    }

    public void checkBlogLinkDisplay() {
        try {
            wc.PerformActionOnElement("BlogLink_HomePage", "Click", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void scrollToWebElement(String ele) {
    	 try {
             wc.PerformActionOnElement(ele, "Scroll", "");
         } catch (Exception e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    }
    public void closeCurrentWindowScreen()
    {
   	 try {
            wc.PerformActionOnElement("", "CloseTab", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   }
    public void checkBlogLinkDisplayIfExists() {
        try {
            wc.PerformActionOnElement("BlogLink_HomePage", "ClickIfExists", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void isElementExist(String ele) {
        try {
            wc.PerformActionOnElement(ele, "ElementExist", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void getElementDescrition(String ele) {
        try {
            wc.PerformActionOnElement(ele, "ElementText", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void switchToNextWindow() {
        try {
            wc.PerformActionOnElement("", "SwitchWindow", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void inputText(String ele, String txt) {
        try {
            wc.PerformActionOnElement(ele, "Type", txt);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void selectText(String ele, String txt) {
        try {
            wc.PerformActionOnElement(ele, "Select", txt);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void clickButton(String ele) {
        try {
            wc.PerformActionOnElement(ele, "Click", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}