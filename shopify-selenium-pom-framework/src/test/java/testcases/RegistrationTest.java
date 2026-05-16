package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import utillities.DriverSetUp;

public class RegistrationTest extends DriverSetUp {
  RegistrationPage registrationPage = new RegistrationPage();
    @BeforeMethod
    public void navigateToRegistrationPage(){ getDriver().get(registrationPage.registerPageUrl);}

    @Test
    public void TestUserRegistrationProcess() {
        getDriver().get(registrationPage.registerPageUrl);
        registrationPage.clickOnElement(registrationPage.signUpWithEmail);
        registrationPage.writeOnElement(registrationPage.email,"rafiqul.islam01408@gmail.com");
        registrationPage.writeOnElement(registrationPage.FirstName,"Rafiqul");
        registrationPage.writeOnElement(registrationPage.lastName,"Islam");
        registrationPage.writeOnElement(registrationPage.password,"sg#dd547");
        registrationPage.writeOnElement(registrationPage.confirmPassword,"56klDF@#sdd ");
    }
    @Test
    public void TestUserRegistrationProcessWithBeforeUsedCredentials() {
        getDriver().get(registrationPage.registerPageUrl);
        registrationPage.clickOnElement(registrationPage.signUpWithEmail);
        registrationPage.writeOnElement(registrationPage.email, "rafiqul.islam01408@gmail.com");
        registrationPage.writeOnElement(registrationPage.FirstName, "Rafiqul");
        registrationPage.writeOnElement(registrationPage.lastName, "Islam");
        registrationPage.writeOnElement(registrationPage.password, "sg#dd547");
        registrationPage.writeOnElement(registrationPage.confirmPassword, "56klDF@#sdd ");
    }



}
