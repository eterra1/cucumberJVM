package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.*;
import pageobjects.HomePage;


public class Steps {
    public WebDriver driver;
    private HomePage homepage;


    public  Steps(){
        driver = Hooks.driver;
        homepage = PageFactory.initElements(driver,HomePage.class);
    }

    @Given("^I am on Facebook login page$")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com");

    }


    @When("^I enter username as \"(.*)\"$")
    public void enterUsername(String arg1) {
        homepage.email.sendKeys(arg1);
    }

    @When("^I enter password as \"(.*)\"$")
    public void enterPassword(String arg1) {
        homepage.pass.sendKeys(arg1);
        homepage.login.click();
    }

    @Then("^Login should fail$")
    public void checkFail() {
        if (driver.getCurrentUrl().equalsIgnoreCase("httpas://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
            System.out.println("Test1 Pass");
        } else {
            System.out.println("Test1 Failed");
        }
    }
}
