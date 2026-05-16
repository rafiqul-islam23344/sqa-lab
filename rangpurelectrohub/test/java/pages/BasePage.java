package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;


import static pages.HomePage.searchBox;
import static pages.HomePage.searchButton;
import static utilities.DriverSetUp.getDriver;

public class BasePage {
    public static WebDriverWait wait;
    // element khujar jonno method
    public static WebElement getElement(By Locator){
        return waitForElementPresent(Locator);
        // return getDriver().findElement(Locator);
    }

    // click korer jonno method// static remove kora hoice
    public static void clickOnElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );

        element.click();
    }

    // static remove kora hoice
    public static void writeOnElement(By locator, String value) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        element.clear();
        element.sendKeys(value);
    }

    public boolean isElementVisible(By Locator){
        return  getElement(Locator).isDisplayed();
    }


    public static WebElement waitForElementPresent(By Locator){
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
    }
    public void waitForElementToBeClickable(By Locator){

        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Locator));
    }

    public void selectWithVisibleText(By selectLocator, String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);

    }
    // নির্দিষ্ট এলিমেন্ট পর্যন্ত স্ক্রল করার মেথড
    public void scrollToElement(By locator) {
        try {
            WebElement element = getDriver().findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            // এটি এলিমেন্টটিকে স্ক্রল করে ভিউপোর্টের মাঝখানে নিয়ে আসবে
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        } catch (Exception e) {
            System.out.println("Error scrolling to element: " + e.getMessage());
        }
    }
    public void searchProduct(String productName){

        writeOnElement(searchBox, productName);

        clickOnElement(searchButton);
    }
}
