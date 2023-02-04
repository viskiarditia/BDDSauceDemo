package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {
        public static WebDriver driver;

        public LandingPage( WebDriver driver){
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
// deklarasi element pada landing page untuk sales order

    @FindBy(xpath = "//span[@class='title']")
    private WebElement vrifyLandingPage;
    public boolean setVerifyLandingPage(){
        vrifyLandingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer;
    public void setSortProduct(String sort){
        Select a = new Select(selectContainer);
        a.selectByVisibleText(sort);
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement basket1;
    public void setClickBasket1(){basket1.click();}

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basket2;
    public void setClickBasket2(){
        basket2.click();
    }

}
