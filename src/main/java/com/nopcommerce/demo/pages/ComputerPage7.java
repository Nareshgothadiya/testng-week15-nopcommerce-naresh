package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage7 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement clickOnNextDayAir;

    public void clickOnNextDayAirButton() {
        Reporter.log("clickOnNextDayAirButton" + clickOnNextDayAir.toString());
        clickOnElement(clickOnNextDayAir);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement clickOnContinueTab;

    public void clickOnContinueButtonAgain() {
        Reporter.log("clickOnContinueButtonAgain" + clickOnContinueTab.toString());
        clickOnElement(clickOnContinueTab);
    }

}
