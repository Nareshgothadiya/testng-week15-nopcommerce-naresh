package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage4 extends Utility {


    By clearText = By.xpath("//input[@value='1']");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement sendTextToQuantity;


    public void sendTextToQuantityField() {
        Reporter.log("sendTextToQuantityField" + sendTextToQuantity.toString());
        sendTextToElement(sendTextToQuantity, "2");
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;

    public void clickOnUpdateShoppingCartButton() {
        Reporter.log("clickOnUpdateShoppingCartButton" + clickOnUpdateShoppingCart.toString());
        clickOnElement(clickOnUpdateShoppingCart);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement verifyTotal1;

    public String verifyTotal2950() {
        Reporter.log("verifyTotal2950" + verifyTotal1.toString());
        return getTextFromElement(verifyTotal1);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        Reporter.log("clickOnCheckBoxIAgreeWithTermsAndCondition" + clickOnCheckbox.toString());
        clickOnElement(clickOnCheckbox);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    public void clickOnCheckOutButton() {
        Reporter.log("clickOnCheckOutButton" + clickOnCheckout.toString());
        clickOnElement(clickOnCheckout);
    }

}
