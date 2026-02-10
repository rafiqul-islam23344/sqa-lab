package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{
    public String  registrationPageUrl = "https://www.xampro.org/signup";

    public String  registrationPageTitle = "Registration";

    public By fullname = By.xpath("//input[@id='name']");
    public By email = By.xpath("//input[@id='email']");

    public By phonenumber = By.xpath("//input[@id='phoneNumber']");

    public By passWord = By.xpath("//input[@id='password']");

    public By confirmpassWord = By.xpath("//input[@id='confirmPassword']");

    public By registerButton = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/form[1]/div[6]/div[1]/button[1]/div[1]/img[1]");


}
