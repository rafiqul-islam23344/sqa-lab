package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utilies.DriverSetup;

public class TestRegistration extends DriverSetup {
    RegistrationPage registrationPage = new RegistrationPage();
    @Test

    public void TestUserRegistrationProcess(){
//    getDriver().get(registrationPage.registrationPageUrl);
//    registrationPage.clickOnElement(registrationPage.genderMale);
//    registrationPage.writeOnElement(registrationPage.firstName,"MD");
//    registrationPage.writeOnElement(registrationPage.lastName,"karim");
//    registrationPage.selectWithVisibleText(registrationPage.dayOption,"5");
//    registrationPage.selectWithVisibleText(registrationPage.monthOption,"July");
//    registrationPage.selectWithVisibleText(registrationPage.yearOption,"1994");
//    registrationPage.writeOnElement(registrationPage.email,"rafiqul12@gmail.com");
//    registrationPage.writeOnElement(registrationPage.companyName,"ids group");
//    registrationPage.writeOnElement(registrationPage.passWord,"6465AF6@DF");
//    registrationPage.writeOnElement(registrationPage.confirmPassWord,"6465AF6@DF");
//    registrationPage.clickOnElement(registrationPage.registerButton);

        registrationPage.registerUser();
    Assert.assertTrue(registrationPage.isElementVisible(registrationPage.registrationConfirmMs));
Assert.assertEquals(registrationPage.getElementText(registrationPage.registrationConfirmMs),registrationPage.registrationConfirmMsText);
    }
}
