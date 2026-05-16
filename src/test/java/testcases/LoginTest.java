package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DriverSetUp;

public class LoginTest extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
@BeforeMethod
    public void navigateToLoginPage(){getDriver().get(loginPage.LoginPageUrl);}

    @Test
public void TestLoginWithInvalidCredential(){
        LoginPage.writeOnElement(loginPage.username,"rafiqul.islam@gmail.com");
        LoginPage.writeOnElement(loginPage.password,"fjR45^JKD");
        LoginPage.clickOnElement(loginPage.loginButton);
    }
    @Test
    public void TestLoginWithoutCredential(){
    LoginPage.writeOnElement(loginPage.username," ");
    LoginPage.writeOnElement(loginPage.password," ");
    LoginPage.clickOnElement(loginPage.loginButton);

    }
    @Test
    public void TestLoginWithoutUsername(){
        LoginPage.writeOnElement(loginPage.username," ");
        LoginPage.writeOnElement(loginPage.password,"kjhsdf $t6");
        LoginPage.clickOnElement(loginPage.loginButton);

    }

    @Test
    public void TestLoginWithoutPassword(){
        LoginPage.writeOnElement(loginPage.username,"rahat345.23@gmail.com");
        LoginPage.writeOnElement(loginPage.password," ");
        LoginPage.clickOnElement(loginPage.loginButton);

    }
    @Test
    public void TestLoginWithValidCredential(){
        LoginPage.writeOnElement(loginPage.username,"rafiqul.789.@gmail.com");
        LoginPage.writeOnElement(loginPage.password,"-8=UM87SEr9T'@7");
        LoginPage.clickOnElement(loginPage.loginButton);

    }
}
