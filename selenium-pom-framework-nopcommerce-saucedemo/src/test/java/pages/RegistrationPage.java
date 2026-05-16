package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static utilies.DriverSetup.getDriver;

public class RegistrationPage extends BasePage{

    public String  registrationPageUrl = "https://demo.nopcommerce.com/register?returnUrl=%2F";
    public String  registrationPageTitle = "Register";

    public By genderMale = By.xpath("//input[@id='gender-male']");

    public By firstName = By.xpath("//input[@id='FirstName']");
    public By lastName = By.xpath("//input[@id='LastName']");
    public By email = By.xpath("//input[@id='Email']");
    public By companyName = By.xpath("//input[@id='Company']");
    public By passWord = By.xpath("//input[@id='Password']");
    public By confirmPassWord = By.xpath("//input[@id='ConfirmPassword']");
    public By registerButton = By.xpath("//button[@id='register-button']");
    public By dayOption = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    public By monthOption = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    public By yearOption = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
     public By registrationConfirmMs = By.xpath("//div[contains(text(),'Your registration completed')]");
     public String registrationConfirmMsText= "Your registration completed";


     public void registerUser(){

         getDriver().get(registrationPageUrl);
         clickOnElement(genderMale);
         writeOnElement(firstName,"MD");
         writeOnElement(lastName,"karim");
         selectWithVisibleText(dayOption,"5");
        selectWithVisibleText(monthOption,"July");
        selectWithVisibleText(yearOption,"1994");
         writeOnElement(email,"rafiqul12@gmail.com");
         writeOnElement(companyName,"ids group");
       writeOnElement(passWord,"6465AF6@DF");
         writeOnElement(confirmPassWord,"6465AF6@DF");
       clickOnElement(registerButton);
         Assert.assertTrue(isElementVisible(registrationConfirmMs));
         Assert.assertEquals(getElementText(registrationConfirmMs),registrationConfirmMsText);
     }
}
