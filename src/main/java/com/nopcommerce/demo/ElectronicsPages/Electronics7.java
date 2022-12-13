package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics7 extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyTextShoppingCart;


    public String verifyTextShoppingCart() {
        Reporter.log("verifyTextShoppingCart" + verifyTextShoppingCart.toString());
        return getTextFromElement(verifyTextShoppingCart);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox1;

    public void clickOnCheckbox1() {
        Reporter.log("lickOnCheckbox1" + clickOnCheckbox1.toString());
        clickOnElement(clickOnCheckbox1);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout1;

    public void clickOnCheckout1() {
        Reporter.log("clickOnCheckout1" + clickOnCheckout1.toString());
        clickOnElement(clickOnCheckout1);
    }


}
