package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage9 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement clickOnMasterCard;

    public void selectMasterCardFromCreditCardDropdown(String value) {
        Reporter.log("selectMasterCardFromCreditCardDropdown" + clickOnMasterCard.toString());
        selectByValueFromDropDown(clickOnMasterCard, value);
    }

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholdername;

    public void sendTextTOCardHolderName(String name) {
        Reporter.log("sendTextTOCardHolderName" + cardholdername.toString());
        sendTextToElement(cardholdername, name);
    }

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    public void sendTextTOCardNumber(String num) {
        Reporter.log("sendTextTOCardNumber" + cardNumber.toString());
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;

    public void sendTextToCardCode(String code) {
        Reporter.log("sendTextToCardCode" + cardCode.toString());
        sendTextToElement(cardCode, code);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton2;

    public void clickOnContinueButton2() {
        Reporter.log("clickOnContinueButton2" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

}
