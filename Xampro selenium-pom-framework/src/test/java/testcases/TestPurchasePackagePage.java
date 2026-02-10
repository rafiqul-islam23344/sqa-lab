package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PurchasePackagePage;
import utilites.DriverSetUp;

public class TestPurchasePackagePage extends DriverSetUp {
    LoginPage loginPage= new LoginPage();

PurchasePackagePage purchasePackagePage= new PurchasePackagePage(); //package name change korci
    @BeforeMethod
    public void navigateToPurchaseProductPage(){
        getDriver().get(loginPage.longinPageUrl);
        loginPage.dologin("rafiqul.islam01408@gmail.com","56klKL@@");
    }
    @Test
    public void purchaseExamPackage(){

     purchasePackagePage.clickOnElement(purchasePackagePage.ExamPackeges);
     purchasePackagePage.clickOnElement(purchasePackagePage.IELTSbutton);
     purchasePackagePage.clickOnElement(purchasePackagePage.FreeTrails);
     //purchasePackagePage.clickOnElement(purchasePackagePage.GoToCartButton);
     //purchasePackagePage.clickOnElement(purchasePackagePage.CuponSection);
     //purchasePackagePage.clickOnElement(purchasePackagePage.ApplyButton);
     //purchasePackagePage.clickOnElement(purchasePackagePage.TickMark);
     //purchasePackagePage.clickOnElement(purchasePackagePage.payment);

    }
}
