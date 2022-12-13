package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage11 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement varifText4;

    public String getVerifyText4() {
        Reporter.log("getVerifyText4" + varifText4.toString());
        return getTextFromElement(varifText4);

    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement varifText5;


    public String getVerifyText5() {
        Reporter.log("getVerifyText5" + varifText5.toString());
        return getTextFromElement(varifText5);

    }

    @CacheLookup
    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button")
    WebElement continueButton3;

    public void clickOnContinueButton3() {
        Reporter.log("clickOnContinueButton3" + continueButton3.toString());
        clickOnElement(continueButton3);
    }

}
