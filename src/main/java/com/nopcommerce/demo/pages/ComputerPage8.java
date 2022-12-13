package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage8 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement clickOnCreditCard;

    public void clickOnCreditCardButton() {
        Reporter.log("clickOnCreditCardButton" + clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueButton;


    public void selectClickOnContinue1() {
        Reporter.log("selectClickOnContinue1" + continueButton.toString());
        clickOnElement(continueButton);
    }

}
