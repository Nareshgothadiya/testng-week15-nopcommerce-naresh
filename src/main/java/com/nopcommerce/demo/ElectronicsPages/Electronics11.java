package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics11 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@value='Payments.Manual']")
    WebElement clickOnSelectCreditCard;

    public void clickOnSelectCreditCard() {
        Reporter.log("clickOnSelectCreditCard" + clickOnSelectCreditCard.toString());
        clickOnElement(clickOnSelectCreditCard);
    }

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Visa')]")
    WebElement clickOnVisa;

    public void clickOnVisa() {
        Reporter.log("clickOnVisa" + clickOnVisa.toString());
        clickOnElement(clickOnVisa);
    }

    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement sendTextToCardholderName;

    public void sendTextToCardholderName(String cardHolderName) {
        Reporter.log("sendTextToCardholderName" + sendTextToCardholderName.toString());
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement sendTextToCardNumber;

    public void sendTextToCardNumber(String cardNumber) {
        Reporter.log("sendTextToCardNumber" + sendTextToCardNumber.toString());
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement sendTextToExpirationMonth;

    public void sendTextToExpirationMonth(String expirationMonth) {
        Reporter.log("sendTextToExpirationMonth" + sendTextToExpirationMonth.toString());
        selectByValueFromDropDown(sendTextToExpirationMonth, expirationMonth);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement sendTextToExpirationYear;

    public void sendTextToExpirationYear(String expirationYear) {
        Reporter.log("sendTextToExpirationYear" + sendTextToExpirationYear.toString());
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement sendTextToCardCode;

    public void sendTextToCardCode(String cardCode) {
        Reporter.log("sendTextToCardCode" + sendTextToCardCode.toString());
        sendTextToElement(sendTextToCardCode, cardCode);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue3;

    public void clickOnContinue3() {
        Reporter.log("clickOnContinue3" + clickOnContinue3.toString());
        clickOnElement(clickOnContinue3);
    }

}