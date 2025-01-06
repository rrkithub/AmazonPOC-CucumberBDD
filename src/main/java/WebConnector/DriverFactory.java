package WebConnector;

import org.openqa.selenium.WebDriver;

import java.util.Optional;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    static void set(WebDriver driver) {
        webDriver.set(driver);
    }

    public static WebDriver get() {
        return Optional.ofNullable(webDriver.get())
                .orElseThrow(() -> new IllegalStateException("Driver is NOT initialised"));
    }

    static void remove() {
        webDriver.remove();
        webDriver.set(null);
    }
}