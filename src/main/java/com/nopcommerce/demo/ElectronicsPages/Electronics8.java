package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics8 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;


    public void countryByVisibleText(String name) {
        Reporter.log("countryByVisibleText" + selectCountry.toString());
        selectByVisibleTextFromDropDown(selectCountry, name);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement sendTextToCity;

    public void sendTextToCity(String city) {
        Reporter.log("sendTextToCity" + sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement sendTextToAddress;

    public void sendTextToAddress(String address) {
        Reporter.log("sendTextToAddress" + sendTextToAddress.toString());
        sendTextToElement(sendTextToAddress, address);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement sendTextToPostelCode;

    public void sendTextToPostelCode(String postalCode) {
        Reporter.log("sendTextToPostelCode" + sendTextToPostelCode.toString());
        sendTextToElement(sendTextToPostelCode, postalCode);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement sendTextToPhoneNumber;

    public void sendTextToPhoneNumber(String phoneNumber) {
        Reporter.log("sendTextToPhoneNumber" + sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue1;

    public void clickOnContinue1() {
        Reporter.log("clickOnContinue1" + clickOnContinue1.toString());
        clickOnElement(clickOnContinue1);
    }

}