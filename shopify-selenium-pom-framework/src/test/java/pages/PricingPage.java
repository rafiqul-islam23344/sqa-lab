package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PricingPage extends BasePage{
    public String PricingPageUrl = "https://www.shopify.com/pricing";
    public By payPerMonth = By.xpath("//button[@id='pricingMonthYearToggle-monthly-plan-toggle']");

    public String expectedTitle = "https://www.shopify.com/pricing";
}
