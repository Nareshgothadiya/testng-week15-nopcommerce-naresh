package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics10 extends Utility {


    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement clickOnCreditCard;


    public void clickOnCreditCard() {
        Reporter.log("clickOnCreditCard" + clickOnCreditCard.toString());
        clickOnElement(clickOnCreditCard);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[1]")
    WebElement clickOnContinue5;

    public void clickOnContinueTab() {
        Reporter.log("clickOnContinueTab" + clickOnContinue5.toString());
        clickOnElement(clickOnContinue5);
    }


}