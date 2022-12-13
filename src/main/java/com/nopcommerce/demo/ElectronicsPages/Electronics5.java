package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics5 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTextRegister;


    public String verifyTextRegister() {
        Reporter.log("verifyTextRegister" + verifyTextRegister.toString());
        return getTextFromElement(verifyTextRegister);
    }

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement sendTextToFirstNameField;

    public void sendTextToFirstNameField(String firstname) {
        Reporter.log("sendTextToFirstNameField" + sendTextToFirstNameField.toString());
        sendTextToElement(sendTextToFirstNameField, firstname);
    }

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement sendTextToLastNameField;

    public void sendTextToLastNameField(String lastname) {
        Reporter.log("sendTextToLastNameField" + sendTextToLastNameField.toString());
        sendTextToElement(sendTextToLastNameField, lastname);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement sendTextToDay;

    public void sendTextToDay(String day) {
        Reporter.log("sendTextToDay" + sendTextToDay.toString());
        sendTextToElement(sendTextToDay, day);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement sendTextToMonth;

    public void sendTextToMonth(String month) {
        Reporter.log("sendTextToMonth" + sendTextToMonth.toString());
        sendTextToElement(sendTextToMonth, month);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement sendTextToYear;

    public void sendTextToYear(String year) {
        Reporter.log("sendTextToYear" + sendTextToYear.toString());
        sendTextToElement(sendTextToYear, year);
    }

    @CacheLookup
    @FindBy(id = "Email")
    WebElement sendTextToEmailField;

    public void sendTextToEmailField(String email) {
        Reporter.log("sendTextToEmailField" + sendTextToEmailField.toString());
        sendTextToElement(sendTextToEmailField, email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement sendTextToPasswordField;

    public void sendTextToPasswordField(String password) {
        Reporter.log("sendTextToPasswordField" + sendTextToPasswordField.toString());
        sendTextToElement(sendTextToPasswordField, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement sendTextToConfirmPasswordField;

    public void sendTextToConfirmPasswordField(String confirmPassword) {
        Reporter.log("sendTextToConfirmPasswordField" + sendTextToConfirmPasswordField.toString());
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister1;

    public void clickOnRegister1() {
        Reporter.log("clickOnRegister1" + clickOnRegister1.toString());
        clickOnElement(clickOnRegister1);
    }

}