package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utillities.DriverSetUp;

public class LoginTest extends DriverSetUp {
LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void navigateToLoginPage(){
        getDriver().get(loginPage.longinPageUrl);}

    @Test
    public void TestLoginWithInvalidCredential() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, "rafiqul.islam01408@gmail.com");
        Thread.sleep(5000);
        getDriver().findElement(loginPage.continueWithEmail).isDisplayed();
        System.out.println( getDriver().findElement(loginPage.continueWithEmail).isDisplayed());
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password,"56klDF@#sdd ");
        loginPage.clickOnElement(loginPage.login);

    }

    @Test
    public void TestLoginWithInvalidPassword() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, "rafiqul.islam01408@gmail.com");
        Thread.sleep(5000);
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password,"56klDF@#sdd");
        loginPage.clickOnElement(loginPage.login);

    }
    @Test
    public void TestLoginWithoutUsername() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, " ");
        Thread.sleep(5000);
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password,"56klDF@#sdd");
        loginPage.clickOnElement(loginPage.login);

    }
    @Test
    public void TestLoginWithoutUsernameAndPassword() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, " ");
        Thread.sleep(5000);
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password," ");
        loginPage.clickOnElement(loginPage.login);

    }
    @Test
    public void TestLoginWithoutPassword() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, "rafiqul.islam01408@gmail.com");
        Thread.sleep(5000);
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password," ");
        loginPage.clickOnElement(loginPage.login);

    }
    @Test
    public void TestLoginWithoutUserName() throws InterruptedException {

        loginPage.writeOnElement(loginPage.email, " ");
        Thread.sleep(5000);
        loginPage.clickOnElement(loginPage.continueWithEmail);
        Thread.sleep(5000);
        loginPage.writeOnElement(loginPage.password,"56klDF@#sdd");
        loginPage.clickOnElement(loginPage.login);

    }
}
