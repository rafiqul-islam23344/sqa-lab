package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static utilies.DriverSetup.getDriver;

    public class BasePage {

    public WebDriverWait wait;
        // element khujar jonno method
    public WebElement getElement(By Locator){
       return waitForElementPresent(Locator);
       // return getDriver().findElement(Locator);
    }

    // click korer jonno method
    public void clickOnElement (By Locator){
        getElement(Locator).click();
        }

    // element theke text ber kore ane
        public String getElementText (By Locator){

        return  getElement(Locator).getText();
    }


    public void writeOnElement(By Locator, String text){
        getElement(Locator).clear();
        getElement(Locator).sendKeys(text);
    }

    public boolean isElementVisible(By Locator){
        return  getElement(Locator).isDisplayed();
    }


    public WebElement waitForElementPresent(By Locator){
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

}
