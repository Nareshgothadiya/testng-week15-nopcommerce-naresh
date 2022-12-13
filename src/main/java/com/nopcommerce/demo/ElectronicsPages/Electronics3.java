package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics3 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShopCart;

    public String verifyMessageShoppingCart() {
        Reporter.log("verifyMessageShoppingCart" + verifyMessageShopCart.toString());
        return getTextFromElement(verifyMessageShopCart);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;


    public String verifyQuantity() {
        Reporter.log("verifyQuantity" + verifyQuantity.toString());
        return getTextFromElement(verifyQuantity);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement verifyTotal;


    public String verifyTotal() {
        Reporter.log("verifyTotal" + verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;


    public void clickOnCheckbox() {
        Reporter.log("clickOnCheckbox" + clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;


    public void clickOnCheckout() {
        Reporter.log("clickOnCheckout" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }
}
