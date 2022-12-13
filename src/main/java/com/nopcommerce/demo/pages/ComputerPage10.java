package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage10 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement varifText1;

    public String getVerifyText1() {
        Reporter.log("getVerifyText1" + varifText1.toString());
        return getTextFromElement(varifText1);

    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement varifText2;

    public String getVerifyText2() {
        Reporter.log("getVerifyText2" + varifText2.toString());
        return getTextFromElement(varifText2);

    }

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[2]/span/strong")
    WebElement varifText3;

    public String getVerifyText3() {
        Reporter.log("getVerifyText3" + varifText3.toString());
        return getTextFromElement(varifText3);

    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 confirm-order-next-step-button']")
    WebElement conform;

    public void clickOnConformButton() {
        Reporter.log("clickOnConformButton" + conform.toString());
        clickOnElement(conform);
    }
}
