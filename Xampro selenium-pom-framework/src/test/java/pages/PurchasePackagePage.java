package pages;

import org.openqa.selenium.By;

public class PurchasePackagePage extends BasePage{
    public String longinPageUrl= "https://www.xampro.org/login";
    public By signOnButton = By.xpath("public String longinPageUrl= \"https://www.xampro.org/login\";");
    public By ExamPackeges =By.xpath("//a[contains(text(),'Exam Packages')]");
    public By IELTSbutton =By.xpath("//body[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/span[2]/h6[1]");
    public By FreeTrails = By.xpath("//div[contains(text(),'Free Trial (Academic)')]");
    public  By GoToCartButton= By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]");
    public By CuponSection=By.xpath("//input[@id='exampleInputEmail1']");
    public By ApplyButton =By.xpath("//button[contains(text(),'Apply')]");
    public By TickMark= By.xpath("//input[@id='agree']");
    public By payment=By.xpath("//button[contains(text(),'Payment')]");


}
