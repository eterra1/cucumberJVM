package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

    public  HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement pass;

    @FindBy(id = "loginbutton")
    public WebElement login;

}
