package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseStep {

    private WebDriver webDriver;
    public PurchaseStep(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    // LANDING PAGE
    @Then("User already on landing page")
    public void verifyLandingPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        LandingPage landingPage = new LandingPage(webDriver);
        Assert.assertTrue(landingPage.setVerifyLandingPage());
        Thread.sleep(3000);
    }
    @Then("User sort product list by \"(.*)\"")
    public void  sortProductValue(String sort) throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setSortProduct(sort);
        Thread.sleep(3000);
    }
    @And("User choice 2 product from the list")
    public void choiceProduct() throws InterruptedException {
        LandingPage landingPage = new LandingPage(webDriver);
        landingPage.setClickBasket1();
        landingPage.setClickBasket2();
        Thread.sleep(3000);
    }

    // CART
    @And("User Click Product add to cart")
    public void clickcart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setClickCart();
        Thread.sleep(3000);
    }
    @And("User Click remove product to cart")
    public void clickremove() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setClickRemove();
        Thread.sleep(3000);
    }
    @And("User Click Check Out product")
    public void clickCheckOut() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.setClickCheckOut();
        Thread.sleep(3000);
    }

    //CHECK OUT : YOUR INFORMMATION
    @When("User input \"(.*)\" as firstNameCheckOut and input \"(.*)\" as lastNameCheckOut and input \"(.*)\" as portalCode")
    public void inputCheckOut(String fN, String lN, String pC) throws InterruptedException {
        CheckOutInfo checkOutInfo = new CheckOutInfo(webDriver);
        checkOutInfo.setfN(fN);
        checkOutInfo.setlN(lN);
        checkOutInfo.setpC(pC);
        Thread.sleep(3000);
    }
    @And("User Click continue confirm to payment")
    public void continueConfirm() throws InterruptedException {
        CheckOutInfo checkOutInfo = new CheckOutInfo(webDriver);
        checkOutInfo.setClickCheckConfirm();
        Thread.sleep(3000);
    }
    @And("User Click cancel Confirm Order berfore Check Out")
    public void cancelConfirmOrder() throws InterruptedException {
        CheckOutInfo checkOutInfo = new CheckOutInfo(webDriver);
        checkOutInfo.setCancelConfirm();
        Thread.sleep(3000);
    }

    //CHECK OUT : OVERVIEW
    @Then("Page Display where item price is same with item total")
    public void verifyPrice(){
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        Assert.assertEquals(checkOutOverview.setItemPrice(),checkOutOverview.setItemTotal(),0);
    }
    @And("Page Display the item total price after tax is same with total purchase")
    public void verifyTotal() throws InterruptedException {
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        Assert.assertEquals(checkOutOverview.setItemTotal()+checkOutOverview.setTax(), checkOutOverview.setTotalPurchase(), 0);
        Thread.sleep(3000);
    }

    //CHECK OUT : FINISH & LOG OUT
    @And("User Click Finish for Order Done")
    public void buttonFinishOrder() throws InterruptedException {
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        checkOutOverview.setBtnFinish();
        Thread.sleep(3000);
    }
    @Then("THANK YOU FOR YOUR ORDER")
    public void headerFinish() throws InterruptedException {
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        checkOutOverview.setHdrfinish();
        Thread.sleep(3000);
    }
    @And("User Click Burger Button")
    public void burgerButton() throws InterruptedException {
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        checkOutOverview.setBrgrbutton();
        Thread.sleep(3000);
    }
    @And("User Click Button Log Out")
    public void buttonLogOut() throws InterruptedException {
        CheckOutOverview checkOutOverview = new CheckOutOverview(webDriver);
        checkOutOverview.setBtnlogout();
        Thread.sleep(3000);
    }

}
