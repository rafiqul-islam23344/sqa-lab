package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
    public static WebDriver initializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        return new ChromeDriver();
    }
}
