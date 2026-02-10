package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PricingPage;
import utillities.DriverSetUp;

public class TestPricingPage extends DriverSetUp {
PricingPage pricingPage = new PricingPage();
    @BeforeMethod
    public void navigateToPricingPage() {
        getDriver().get(pricingPage.PricingPageUrl);


    }
    @Test
    public void testPricingPageIsWorkWell(){
        pricingPage.clickOnElement(pricingPage.payPerMonth);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.shopify.com/pricing");

    }



}
