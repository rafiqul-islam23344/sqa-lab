package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public static String homePageUrl = "https://rangpurelectrohub.com/";

    public static By logo = By.xpath("//span[@class='font-heading hidden truncate text-base font-bold text-white sm:inline-block sm:max-w-");

    public static By searchBox = By.xpath("//input[@placeholder='Search products (TV, Fan, Blender…)']");

    public static By searchButton = By.xpath("//button[@type='submit']//*[name()='svg']");

    public static By loginButton = By.xpath("//a[@class='inline-flex min-h-");

    public static By categoryMenu = By.xpath("//span[normalize-space()='Shop By Category']");

    public static By firstProduct = By.xpath("//body/main[@class='flex-1 w-full max-w-full min-w-0 overflow-x-hidden']/div[@class='page-content w-full max-w-full']/div[@class='w-full max-w-/main[@id='categories']/section[@class='section']/section[@class='space-y-5 sm:space-y-6']/div[1]/div[1]");

    public static By cartButton = By.xpath("//div[@class='mb-0.5 text-");

    public static By banner = By.xpath("//img[@alt='Upgrade your home – Smart & Stylish']");

    public static By product = By.xpath("//h3[normalize-space()='Jamuna 300L Refrigerator Black Strip']");
    public static By productName= By.xpath("//h3[normalize-space()='Jamuna 348L Refrigerator Magical Black']");


}

