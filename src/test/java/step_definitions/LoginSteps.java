package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User input \"(.*)\" as userName and input \"(.*)\" as pass")
    public void inputCredential(String userName, String pass) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(pass);
        Thread.sleep(5000);
        loginPage.clickLogin();
        Thread.sleep(5000);
    }

    @Given("User open the website souce demo")
    public void verifyLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
        Thread.sleep(5000);
    }


    @Then("User see error \"(.*)\" on login page")
    public void verifyErrorText(String errorText) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        assertEquals(errorText, loginPage.verifyErrorText());
        Thread.sleep(5000);

    }


}