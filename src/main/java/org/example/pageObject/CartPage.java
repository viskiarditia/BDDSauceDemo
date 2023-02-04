package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    public static WebDriver driver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    /// cart page
    @FindBy(xpath = "//div[@id='shopping_cart_container']/a[1]")
    private WebElement cart;
    public void setClickCart(){ cart.click(); }

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement remove;
    public void setClickRemove(){ remove.click(); }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public void setClickCheckOut(){checkout.click();}

    @FindBy(xpath = "  //button[@id='continue-shopping']")
    private WebElement ctnShopping;
    public void setCtnShopping(){ctnShopping.click();}

}
