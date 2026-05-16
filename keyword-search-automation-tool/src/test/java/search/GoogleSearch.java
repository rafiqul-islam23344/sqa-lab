package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearch {
    public static List<WebElement> search(WebDriver driver, String keyword) {
        // Open Google
        driver.get("https://www.google.com");

        // Search for keyword
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword);
        searchBox.submit();

        // Wait for results (optional)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return search results
        return driver.findElements(By.cssSelector("h3"));
    }
}
