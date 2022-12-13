package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics13 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;

    public String verifyTextThankYou() {
        Reporter.log("verifyTextThankYou" + verifyTextThankYou.toString());
        return getTextFromElement(verifyTextThankYou);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifySuccessfully;

    public String verifySuccessfully() {
        Reporter.log("verifySuccessfully" + verifySuccessfully.toString());
        return getTextFromElement(verifySuccessfully);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement clickOnContinue4;

    public void clickOnContinue4() {
        Reporter.log("clickOnContinue4" + clickOnContinue4.toString());
        clickOnElement(clickOnContinue4);
    }

}