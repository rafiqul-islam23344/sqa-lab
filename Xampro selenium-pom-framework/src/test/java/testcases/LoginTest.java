package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilites.DriverSetUp;

public class LoginTest extends DriverSetUp {
LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void navigateToLoginPage(){
        getDriver().get(loginPage.longinPageUrl);
    }
    @Test
    public void TestLoginWithInvalidCredential(){

        loginPage.writeOnElement(loginPage.username,"rafiqul.islam@gmail.com");
        loginPage.writeOnElement(loginPage.password,"55jkL$5689");
        loginPage.clickOnElement(loginPage.loginButton);


    }
    @Test
    public void TestLoginWithoutInvalidCredential() {

        loginPage.writeOnElement(loginPage.username, " ");
        loginPage.writeOnElement(loginPage.password, " ");
        loginPage.clickOnElement(loginPage.loginButton);
    }

    @Test
    public void TestLoginWithoutUsername() {

        loginPage.writeOnElement(loginPage.username, " ");
        loginPage.writeOnElement(loginPage.password, "jjhLL65#jkh");
        loginPage.clickOnElement(loginPage.loginButton);
    }
    @Test
    public void TestLoginWithoutpassword() {

        loginPage.writeOnElement(loginPage.username, "rafiqul.is0988@gmail.com");
        loginPage.writeOnElement(loginPage.password, " ");
        loginPage.clickOnElement(loginPage.loginButton);
    }
    @Test
    public void TestLoginWithvalidcredential() {

        loginPage.writeOnElement(loginPage.username, "rafiqul.islam01408@gmail.com");
        loginPage.writeOnElement(loginPage.password, "56klKL@@");
        loginPage.clickOnElement(loginPage.loginButton);
    }

}
