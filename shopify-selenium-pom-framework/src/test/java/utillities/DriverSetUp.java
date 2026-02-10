package utillities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetUp {
    private static String browserName= System.getProperty("browser","firefox");
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER=new ThreadLocal<>();

    public static void setDriver (WebDriver driver)
    {
        DriverSetUp DriverSetup = null;
        DriverSetup.LOCAL_DRIVER.set(driver);
    }
    public static WebDriver getDriver() {
        return LOCAL_DRIVER.get();
    }

    public static WebDriver getBrowser(String BrowserName){

        if (BrowserName.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }
        else if (BrowserName.equalsIgnoreCase("firefox")){
            return new FirefoxDriver();
        }

        else if (BrowserName.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }
        else {
            throw new RuntimeException("browser not found,using the given name"+BrowserName);
        }

    }
    @BeforeSuite
    public static synchronized void setBrowser (){
        WebDriver driver=  getBrowser(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        setDriver(driver);
    }

    @AfterSuite
    public void quiteBrowser(){

        getDriver().quit();
    }
}
