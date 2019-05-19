package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePage {

    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id=\"content__main\"]/div[2]/div/div/div/div/div")
    private WebElement textValidation;

    public void login(){
        loginButton.click();
        TestLogger.log("Login Button Clicked");
    }
    public String getResultText(){
        String actualText = textValidation.getText();
        return actualText;

    }
}
