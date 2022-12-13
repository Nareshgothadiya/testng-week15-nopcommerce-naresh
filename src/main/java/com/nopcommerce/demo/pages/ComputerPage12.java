package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage12 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement varifText6;

    public String getVerifyText6() {
        Reporter.log("getVerifyText6" + varifText6.toString());
        return getTextFromElement(varifText6);

    }

}
