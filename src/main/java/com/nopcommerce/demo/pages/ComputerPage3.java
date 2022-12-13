package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage3 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;

    public String getVerifyBuildYourOwn() {
        Reporter.log("getVerifyBuildYourOw" + verifyBuildYourOwn.toString());
        return getTextFromElement(verifyBuildYourOwn);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;


    public void selectProcessorByValue(String value) {
        Reporter.log("selectProcessorByValue" + selectProcessor.toString());
        selectByValueFromDropDown(selectProcessor, value);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;


    public void selectRamByValue(String value) {
        Reporter.log("selectRamByValue" + selectRam.toString());
        selectByValueFromDropDown(selectRam, value);
    }

    @CacheLookup
    @FindBy(xpath = "//label[text()='400 GB [+$100.00]']")
    WebElement selectHDD;

    public void clickOnHDD400GB() {
        Reporter.log("clickOnHDD400GB" + selectHDD.toString());
        clickOnElement(selectHDD);
    }

    @CacheLookup
    @FindBy(xpath = "//label[text()='Vista Premium [+$60.00]']")
    WebElement selectOS;


    public void clickOnOsVistaPremium() {
        Reporter.log("clickOnOsVistaPremium" + selectOS.toString());
        clickOnElement(selectOS);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectSoftware;


    public void clickOnSoftwareTotalCommander() {
        Reporter.log("clickOnSoftwareTotalCommander" + selectSoftware.toString());
        clickOnElement(selectSoftware);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyTotal;


    public String verifyTotalPrice() {
        Reporter.log("verifyTotalPrice" + verifyTotal.toString());
        return getTextFromElement(verifyTotal);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    public void clickOnAddToCartButton() {
        Reporter.log("clickOnAddToCartButton" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyCartMsg;

    public String verifyCaryMessage() {
        Reporter.log("verifyCaryMessage" + verifyCartMsg.toString());
        return getTextFromElement(verifyCartMsg);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMsg;

    public void closeMessageBar() {
        Reporter.log("closeMessageBar" + closeMsg.toString());
        clickOnElement(closeMsg);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement mouseHover;


    public void mouseHoverOnShoppingCart() {
        Reporter.log("mouseHoverOnShoppingCart" + mouseHover.toString());
        mouseHoverToElementAndClick(mouseHover);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement mouseHoverOnShoppingCart;

    public void mouseHoverOnElementShoppingCart() {
        Reporter.log("mouseHoverOnElementShoppingCart" + mouseHoverOnShoppingCart.toString());
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 cart-button']")
    WebElement clickOnGoToCart;


    public void clickOnGoToCart() {
        Reporter.log("clickOnGoToCart" + clickOnGoToCart.toString());
        clickOnElement(clickOnGoToCart);
    }

}
