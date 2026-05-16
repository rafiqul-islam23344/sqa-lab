package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DemoLoginPageSaucedemo;
import pages.DemoProductPage;
import utilies.DriverSetup;

public class TestProductPage extends DriverSetup {
DemoLoginPageSaucedemo demoLoginPageSaucedemo =new DemoLoginPageSaucedemo();
DemoProductPage demoProductPage=new DemoProductPage();

    @BeforeMethod
    public void navigateToProductPage(){
        getDriver().get(demoLoginPageSaucedemo.longinPageUrl);
        demoLoginPageSaucedemo.dologin("standard_user","secret_sauce");
    }
@Test
    public void testAddToCartButton(){
        demoLoginPageSaucedemo.clickOnElement(demoProductPage.addToCartButton);
    Assert.assertEquals(demoProductPage.getCurrentCartItemCount(),"1");


}

//    @Test
//    public void testRemoveCartItemButton(){
//        demoLoginPage.clickOnElement(demoProductPage.addToCartButton);
//        demoLoginPage.clickOnElement(demoProductPage.removeCartItemButton);
//        Assert.assertTrue(demoProductPage.isElementVisible(demoProductPage.addToCartButton));
//        Assert.assertFalse(demoProductPage.isElementVisible(demoProductPage.removeCartItemButton));
//
//
//    }

}
