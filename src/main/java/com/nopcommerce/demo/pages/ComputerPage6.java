package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage6 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickOnCheckoutAsGuest;

    public void clickOnCheckOutAsGuest() {
        Reporter.log("clickOnCheckOutAsGuest" + clickOnCheckoutAsGuest.toString());
        clickOnElement(clickOnCheckoutAsGuest);
    }

    @CacheLookup
    @FindBy(id = "sendTextToFirstName")
    WebElement sendTextToFirstName;

    public void sendTextToFirstNameField(String name) {
        Reporter.log("sendTextToFirstNameField" + sendTextToFirstName.toString());
        sendTextToElement(sendTextToFirstName, name);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement sendTextToLastName;


    public void sendTextToLastNameField(String lastName) {
        Reporter.log("sendTextToLastNameField" + sendTextToLastName.toString());
        sendTextToElement(sendTextToLastName, lastName);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement sendTextToEmail;

    public void sendTextToEmailField(String email) {
        Reporter.log("sendTextToEmailField" + sendTextToEmail.toString());
        sendTextToElement(sendTextToEmail, email);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Company")
    WebElement sendTextToCompany;


    public void sendTextToCompanyField(String company) {
        Reporter.log("sendTextToCompanyField" + sendTextToCompany.toString());
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    // Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
    //        country.selectByVisibleText("United Kingdom
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement sendTextToCity;

    public void sendTextToCityField(String city) {
        Reporter.log("sendTextToCityField" + sendTextToCity.toString());
        sendTextToElement(sendTextToCity, city);
    }

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement sendTextToAddress1;


    public void sendTextToAddressLine1(String address) {
        Reporter.log("sendTextToAddress1" + sendTextToAddress1.toString());
        sendTextToElement(sendTextToAddress1, address);
    }

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address2")
    WebElement sendTextToAddress2;

    public void sendTextToAddressLine2(String address) {
        Reporter.log("sendTextToAddress2" + sendTextToAddress2.toString());
        sendTextToElement(sendTextToAddress2, address);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement sendTextToPostalCode;

    public void sendTextToPostcode(String postcode) {
        Reporter.log("sendTextToPostalCode" + sendTextToPostalCode.toString());
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement sendTextToPhoneNumber;

    public void sendTextToPhoneNumberField(String number) {
        Reporter.log("sendTextToPhoneNumberField" + sendTextToPhoneNumber.toString());
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue;

    public void clickOnContinueButton() {
        Reporter.log("clickOnContinueButton" + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }


}
