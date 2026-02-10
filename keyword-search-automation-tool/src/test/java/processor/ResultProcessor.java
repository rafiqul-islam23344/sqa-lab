package processor;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultProcessor {
    public static String findLongest(List<WebElement> results) {
        String longest = "";
        for (WebElement result : results) {
            String text = result.getText();
            if (text.length() > longest.length()) {
                longest = text;
            }
        }
        return longest;
    }

    public static String findShortest(List<WebElement> results) {
        String shortest = results.get(0).getText();
        for (WebElement result : results) {
            String text = result.getText();
            if (text.length() < shortest.length() && !text.isEmpty()) {
                shortest = text;
            }
        }
        return shortest;
    }
}
