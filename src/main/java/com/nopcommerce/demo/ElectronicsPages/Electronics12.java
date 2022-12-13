package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics12 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod;

    public String verifyPaymentMethod() {
        Reporter.log("verifyPaymentMethod" + verifyPaymentMethod.toString());
        return getTextFromElement(verifyPaymentMethod);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()[normalize-space()='2nd Day Air']]")
    WebElement verifyShopingMethod;

    public String verifyShopingMethod() {
        Reporter.log("verifyShopingMethod" + verifyShopingMethod.toString());
        return getTextFromElement(verifyShopingMethod);
    }

    @CacheLookup
    @FindBy(xpath = "(//strong[text()='$698.00'])[2]")
    WebElement verifyTotalPrice;

    public String verifyTotalPrice() {
        Reporter.log("verifyTotalPrice" + verifyTotalPrice.toString());
        return getTextFromElement(verifyTotalPrice);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement clickOnConfirm;

    public void clickOnConfirm() {
        Reporter.log("clickOnConfirm" + clickOnConfirm.toString());
        clickOnElement(clickOnConfirm);
    }
}