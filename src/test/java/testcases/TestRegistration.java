package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilities.DriverSetUp;

public class TestRegistration extends DriverSetUp {

RegistrationPage registrationPage = new RegistrationPage();
@BeforeMethod
    public void navigateToRegistrasionPage(){getDriver().get(registrationPage.registrationPageUrl);}

    @Test
    public void testRegistrationPageProcessWithValidCredential(){

    registrationPage.writeOnElement(registrationPage.fullname,"rahat hasan");
    registrationPage.writeOnElement(registrationPage.email,"abc.234a@gmail.com");
    registrationPage.writeOnElement(registrationPage.phonenumber,"01798645312");
    registrationPage.writeOnElement(registrationPage.passWord,"h5ty6SW#2wr");
    registrationPage.writeOnElement(registrationPage.confirmpassWord,"h5ty6SW#2wr");
    registrationPage.scrollToElement(registrationPage.createAccount);
    registrationPage.clickOnElement(registrationPage.createAccount);
    }
    @Test
    public void TestUserRegistrationProcessWithBeforeUsedCredentials() {
        registrationPage.writeOnElement(registrationPage.fullname,"rahat hasan");
        registrationPage.writeOnElement(registrationPage.email,"abc.234a@gmail.com");
        registrationPage.writeOnElement(registrationPage.phonenumber,"01798645312");
        registrationPage.writeOnElement(registrationPage.passWord,"h5ty6SW#2wr");
        registrationPage.writeOnElement(registrationPage.confirmpassWord,"h5ty6SW#2wr");
        registrationPage.scrollToElement(registrationPage.createAccount);
        registrationPage.clickOnElement(registrationPage.createAccount);
    }
    @Test
    public void TestRegistrationEmptyCredentials(){
        registrationPage.writeOnElement(registrationPage.fullname," ");
        registrationPage.writeOnElement(registrationPage.email," ");
        registrationPage.writeOnElement(registrationPage.phonenumber," ");
        registrationPage.writeOnElement(registrationPage.passWord," ");
        registrationPage.writeOnElement(registrationPage.confirmpassWord," ");
        registrationPage.scrollToElement(registrationPage.createAccount);
        registrationPage.clickOnElement(registrationPage.createAccount);
    }
}
