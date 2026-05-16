package pages;
import org.openqa.selenium.By;


public class DemoProductPage extends BasePage {


    public    By addToCartButton = By.xpath("//body/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]");
    public By cartItemCount= By.xpath("//span[contains(text(),'1')]");

    public By removeCartItemButton= By.xpath("//button[contains(text(),'REMOVE')]");


    public String getCurrentCartItemCount() {
        return getElementText(cartItemCount);

}

public void navigateToProductPage(){


}


}
