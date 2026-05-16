package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilites.DriverSetUp;

public class TestRegistration extends DriverSetUp {

    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeMethod
    public void navigateToRegistrationPage(){
        getDriver().get(registrationPage.registrationPageUrl);
    }

    @Test
    public void TestUserRegistrationProcess() {
        getDriver().get(registrationPage.registrationPageUrl);
        registrationPage.writeOnElement(registrationPage.fullname, "Rafiqul Islam");
        registrationPage.writeOnElement(registrationPage.email, "56ri60@gmail.com");
        registrationPage.writeOnElement(registrationPage.phonenumber,"01746946449");
        registrationPage.writeOnElement(registrationPage.passWord,"Rafiqul Islam");
        registrationPage.writeOnElement(registrationPage.confirmpassWord,"Rafiqul Islam");
        registrationPage.clickOnElement(registrationPage.registerButton);
    }
    @Test
    public void TestUserRegistrationProcessWithBeforeUsedCredentials() {
        getDriver().get(registrationPage.registrationPageUrl);
        registrationPage.writeOnElement(registrationPage.fullname, "Rafiqul Islam");
        registrationPage.writeOnElement(registrationPage.email, "56ri60@gmail.com");
        registrationPage.writeOnElement(registrationPage.phonenumber,"01746946449");
        registrationPage.writeOnElement(registrationPage.passWord,"Rafiqul Islam");
        registrationPage.writeOnElement(registrationPage.confirmpassWord,"Rafiqul Islam");
        registrationPage.clickOnElement(registrationPage.registerButton);
    }
}
