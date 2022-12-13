package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics14 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToOurStore;

    public String verifyWelcomeToOurStore() {
        Reporter.log("verifyWelcomeToOurStore" + verifyWelcomeToOurStore.toString());
        return getTextFromElement(verifyWelcomeToOurStore);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickOnLogout;

    public void clickOnLogout() {
        Reporter.log("clickOnLogout" + clickOnLogout.toString());
        clickOnElement(clickOnLogout);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyURL;

    public String verifyCurrentURL() {
        Reporter.log("clickOnCurrencyLink" + verifyURL.toString());
        return driver.getCurrentUrl();
    }
}
