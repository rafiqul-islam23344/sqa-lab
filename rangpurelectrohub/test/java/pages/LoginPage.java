package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

public static String LoginPageUrl="https://rangpurelectrohub.com/login";
public String LoginPageTitle="Welcome Back";
public static By username =By.xpath("//input[@id='email']");
    public By password = By.xpath("//input[@id='password']");

    public By loginButton=By.xpath("//button[normalize-space()='Login']");
    public void dologin (String username_text,String password_text){
        writeOnElement(username, username_text);
        writeOnElement(password, password_text);
        clickOnElement(loginButton);

    }

}
