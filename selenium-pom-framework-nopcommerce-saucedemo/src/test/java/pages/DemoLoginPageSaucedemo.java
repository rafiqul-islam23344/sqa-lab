package pages;
import org.openqa.selenium.By;

public class DemoLoginPageSaucedemo extends BasePage{


    // 9 no video

    public String longinPageUrl= "https://www.saucedemo.com/v1/";
    public By userName = By.xpath("//input[@id='user-name']");
    public By password = By.xpath("//input[@id='password']");
    public By loginButton=By.xpath("//input[@id='login-button']");
    public  By error= By.xpath("//body/div[2]/div[1]/div[1]/div[1]/form[1]/h3[1]");

    public void dologin(String username_text,String password_text){
        writeOnElement(userName, username_text);
        writeOnElement(password, password_text);
        clickOnElement(loginButton);

    }
}
