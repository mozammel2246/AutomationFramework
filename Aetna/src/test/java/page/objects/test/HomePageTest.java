package page.objects.test;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends BrowserDriver {

    HomePage homePage;

    @BeforeMethod
    public void initElements(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void testLogin(){
        homePage.login();
        String actualText = homePage.getResultText();
        Assert.assertEquals(actualText, "Select your role to login");

    }



}
