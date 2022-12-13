package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics9 extends Utility {
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement clickOn2ndDayAir;


    public void clickOn2ndDayAir() {
        Reporter.log("clickOn2ndDayAir" + clickOn2ndDayAir.toString());
        clickOnElement(clickOn2ndDayAir);
    }

    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[3]")
    WebElement clickOnContinue2;


    public void clickOnContinue2() {
        Reporter.log("clickOnContinue2" + clickOnContinue2.toString());
        clickOnElement(clickOnContinue2);
    }

}
