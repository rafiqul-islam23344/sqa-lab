package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;
import java.time.Duration;

public class TestHome extends DriverSetUp {


    HomePage homePage = new HomePage();
    WebDriverWait wait;
    WebDriver driver;
    @BeforeMethod
    public void navigateToHomePage() {

        getDriver().manage().deleteAllCookies();
        getDriver().get(HomePage.homePageUrl);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }


    @Test
    public void TestSearchWithValidProduct()  {

        HomePage.writeOnElement(HomePage.searchBox, "Refrigerator");
        HomePage.clickOnElement(HomePage.searchButton);
        //Thread.sleep(5000);
        //Assert.assertTrue(getDriver().getCurrentUrl().contains("https://rangpurelectrohub.com/?search=Refrigerator"));
        System.out.println(getDriver().getCurrentUrl());
        System.out.println(getDriver().getTitle());
        // URL Assertion
        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://rangpurelectrohub.com/"));

        // Title Assertion
        Assert.assertTrue(getDriver().getTitle().contains("Rangpur Electro Hub"));
    }



    // Search Without Product

    @Test
    public void TestSearchWithoutProduct() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        HomePage.writeOnElement(HomePage.searchBox, "jkhf");
       // getDriver().findElement(By.xpath("//input[@placeholder='Search products (TV, Fan, Blender…)']")).sendKeys("text");
        HomePage.clickOnElement(HomePage.searchButton);

        // Empty Search Validation
        //Assert.assertTrue(getDriver().getPageSource().contains(" "));
    }


//     =========================
//     Search Result Visible
//     =========================
    @Test
    public void TestSearchResultVisible(){

        HomePage.writeOnElement(homePage.searchBox,"Refrigerator");
        HomePage.clickOnElement(homePage.searchButton);

        Assert.assertTrue(HomePage.getElement(homePage.product).isDisplayed());
    }


//     =========================
//     Product Name Match
//     =========================
    @Test
    public void TestProductNameMatch(){

        HomePage.writeOnElement(homePage.searchBox,"Jamuna 348L Refrigerator Magical Black");
        HomePage.clickOnElement(homePage.searchButton);

        String actualProduct = HomePage.getElement(homePage.productName).getText();

        String expectedProduct = "Jamuna 348L Refrigerator Magical Black";

        Assert.assertEquals(actualProduct, expectedProduct);
    }


//     =========================
//     Search Box Empty Check
//     =========================
    @Test
    public void TestSearchBoxEmpty(){

        String actualValue = HomePage.getElement(homePage.searchBox).getAttribute("value");

        Assert.assertEquals(actualValue,"");
    }

}
