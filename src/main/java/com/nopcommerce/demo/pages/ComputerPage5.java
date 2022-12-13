package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage5 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcomePleaseSignIn;

    public String verifyWelcomeText() {
        Reporter.log("verifyWelcomeText" + verifyTextWelcomePleaseSignIn.toString());
        return getTextFromElement(verifyTextWelcomePleaseSignIn);
    }

}
