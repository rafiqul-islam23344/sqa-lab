package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{



    public String longinPageUrl= "https://www.xampro.org/login";

    public String loginPageTitle ="nopCommerce demo store";
    public By username= By.xpath("//input[@id='email']");

   public By password = By.xpath("//input[@id='password']");

   public By loginButton=By.xpath("//body/div[@id='root']/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/button[1]/div[1]/img[1]");

    public void dologin (String username_text,String password_text){
        writeOnElement(username, username_text);
        writeOnElement(password, password_text);
        clickOnElement(loginButton);

    }

}
