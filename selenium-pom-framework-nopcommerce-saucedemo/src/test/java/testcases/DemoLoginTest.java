package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DemoLoginPageSaucedemo;
import utilies.DataSet;
import utilies.DriverSetup;

public class DemoLoginTest extends DriverSetup {
    DemoLoginPageSaucedemo demoLoginPageSaucedemo = new DemoLoginPageSaucedemo();

    @BeforeMethod
    public void navigateToLoginPage(){
        getDriver().get(demoLoginPageSaucedemo.longinPageUrl);
    }

    @Test
    public void testLoginWithValidCredentials(){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,"standard_user\n");
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,"secret_sauce");
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/inventory.html");




    }
    @Test
    public void testLoginPageWithoutCredentials(){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,"");
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,"");
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        //Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/inventory.html");
        Assert.assertEquals(demoLoginPageSaucedemo.getElementText(demoLoginPageSaucedemo.error),"Epic sadface: Username is required");



    }

    @Test
    public void testLoginPageWithoutUserName(){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,"");
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,"secret_sauce");
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        //Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/inventory.html");
        Assert.assertEquals(demoLoginPageSaucedemo.getElementText(demoLoginPageSaucedemo.error),"Epic sadface: Username is required");



    }

    @Test
    public void testLoginPageInvalidUserNameAndPassword(){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,"username");
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,"password");
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        //Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/inventory.html");
        Assert.assertEquals(demoLoginPageSaucedemo.getElementText(demoLoginPageSaucedemo.error),"Epic sadface: Username and password do not match any user in this service");



    }

    @Test
    public void testLoginPageInvalidPassword(){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,"standard_user");
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,"password");
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        //Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/inventory.html");
        Assert.assertEquals(demoLoginPageSaucedemo.getElementText(demoLoginPageSaucedemo.error),"Epic sadface: Username and password do not match any user in this service");



    }
    @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class)
    public void testLoginWithoutCredentials(String username,String password,String error_msg){

        //getDriver().get(demoLoginPage.longinPageUrl);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.userName,username);
        demoLoginPageSaucedemo.writeOnElement(demoLoginPageSaucedemo.password,password);
        demoLoginPageSaucedemo.clickOnElement(demoLoginPageSaucedemo.loginButton);
        //Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/v1/");
        Assert.assertEquals(demoLoginPageSaucedemo.getElementText(demoLoginPageSaucedemo.error),error_msg);

    }
}
