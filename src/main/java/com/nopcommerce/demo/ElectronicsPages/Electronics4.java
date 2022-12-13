package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics4 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcomePlease;


    public String verifyTextWelcomePlease() {
        Reporter.log("verifyTextWelcomePlease" + verifyTextWelcomePlease.toString());
        return getTextFromElement(verifyTextWelcomePlease);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;


    public void clickOnRegister() {
        Reporter.log("clickOnRegister" + clickOnRegister.toString());
        clickOnElement(clickOnRegister);
    }

}