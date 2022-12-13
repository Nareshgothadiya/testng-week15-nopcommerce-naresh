package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Computer extends Utility {

    public void sortProductByZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        selectByValueFromDropDown(By.xpath("//select[@name='products-orderby']"), "6");
        products = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);

    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement computerMenu;

    public void clickOnComputer() {
        Reporter.log("clickOnComputer" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='title']//a")
    WebElement desktopMenu;

    public void clickOnDesktop() {
        Reporter.log("clickOnDesktop" + desktopMenu.toString());
        clickOnElement(desktopMenu);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement selectByValue;

    public void getSelectByValue(String value) {
        Reporter.log("getSelectByValue" + selectByValue.toString());
        selectByValueFromDropDown(selectByValue, value);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildYourOwn;

    public String getVerifyBuildYourOwn() {
        Reporter.log("getVerifyBuildYourOwn" + verifyBuildYourOwn.toString());
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
}
//*************************************************************************