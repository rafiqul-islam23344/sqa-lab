package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage{

    public String  registrationPageUrl = "https://rangpurelectrohub.com/signup";

    public String  registrationPageTitle = "Create Account";

    public By fullname = By.xpath("//input[@id='name']");
    public By email = By.xpath("//input[@id='email']");

    public By phonenumber = By.xpath("//input[@id='phone']");

    public By passWord = By.xpath("//input[@id='password']");

    public By confirmpassWord = By.xpath("//input[@id='confirmPassword']");
    public By createAccount= By.xpath("//button[normalize-space()='Create Account']");


  }
