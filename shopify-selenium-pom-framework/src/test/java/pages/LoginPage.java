package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    //public String loginPageUrl2 = "https://accounts.shopify.com/login?rid=c40b272b-92e2-423e-b4c0-6c81020e8166";
    public String longinPageUrl= "https://accounts.shopify.com/lookup?rid=c40b272b-92e2-423e-b4c0-6c81020e8166&verify=1732526634-csMYEa%2Fik46E1oiukl9pdsKxeBaIHesI6jtxs6j5Sj8%3D";
    public String loginPageTitle ="Continue to Shopify";
    public By email= By.xpath("//input[@id='account_email']");
    public By continueWithEmail = By.xpath("//button[@name='commit']");
    public By password = By.xpath("//input[@id='account_password']");
    public  By login = By.xpath("//button[@name='commit']");

}
