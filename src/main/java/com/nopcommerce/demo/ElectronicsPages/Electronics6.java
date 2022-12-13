package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics6 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMessageYourRegistrationComplete;


    public String verifyMessageYourRegistrationCompleted() {
        Reporter.log("verifyMessageYourRegistrationCompleted" + verifyMessageYourRegistrationComplete.toString());
        return getTextFromElement(verifyMessageYourRegistrationComplete);

    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;

    public void clickOnContinue() {
        Reporter.log("clickOnContinue" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }
}
