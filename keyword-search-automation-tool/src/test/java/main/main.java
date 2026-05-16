package main;

import browser.BrowserSetup;
import excel.ExcelHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import processor.ResultProcessor;
import search.GoogleSearch;

import java.util.List;

public class main {

    public static void main(String[] args) {
        // Step 1: Initialize browser
        WebDriver driver = BrowserSetup.initializeBrowser();

        // Step 2: Read keyword from Excel
        String filePath = "data.xlsx";
        String sheetName = "Monday";  // Example
        String keyword = ExcelHandler.readKeyword(filePath, sheetName, 1); // Row 2

        // Step 3: Perform Google Search
        List<WebElement> results = GoogleSearch.search(driver, keyword);

        // Step 4: Process results
        String longest = ResultProcessor.findLongest(results);
        String shortest = ResultProcessor.findShortest(results);

        // Step 5: Write results back to Excel
        ExcelHandler.writeResults(filePath, sheetName, 1, longest, shortest);

        // Step 6: Close browser
        driver.quit();

        System.out.println("Automation Completed!");
    }
}
