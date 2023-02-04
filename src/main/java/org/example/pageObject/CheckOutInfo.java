package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfo {
    public static WebDriver driver;

    public CheckOutInfo(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public void setfN(String fN){firstName.sendKeys(fN);}

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public void setlN(String lN){lastName.sendKeys(lN);}

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public void setpC(String pC){postalCode.sendKeys(pC);}

    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelConfirm;
    public void setCancelConfirm(){cancelConfirm.click();}

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueCart;
    public void setClickCheckConfirm(){continueCart.click();}



}
