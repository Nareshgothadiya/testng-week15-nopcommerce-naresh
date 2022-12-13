package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics2 extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;

    public String verifyTextNokiaLumia() {
        Reporter.log("verifyTextNokiaLumia" + verifyTextNokiaLumia.toString());
        return getTextFromElement(verifyTextNokiaLumia);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyNokiaPrice;

    public String verifyNokiaPrice() {
        Reporter.log("verifyNokiaPrice" + verifyNokiaPrice.toString());
        return getTextFromElement(verifyNokiaPrice);
    }

    @CacheLookup
    @FindBy(xpath = "product_enteredQuantity_20")
    WebElement clearQuantity;


    public void clearQuantitToBlank() {
        Reporter.log("clearQuantitToBlank" + clearQuantity.toString());
        clickOnElement(clearQuantity);
    }

    public void clearQuantity() {
        driver.findElement(By.id("product_enteredQuantity_20")).clear();
    }

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement changeQuantity;

    //By changeQuantity = By.id("product_enteredQuantity_20");
    public void changeQuantityTo2(String text) {
        Reporter.log("changeQuantityTo2" + changeQuantity.toString());
        sendTextToElement(changeQuantity, text);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement updateCart;


    public void clickOnAddToCart() {
        Reporter.log("clickOnAddToCart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyGreenBarMessage;


    public String verifyGreenBarMessage() {
        Reporter.log("verifyGreenBarMessag" + verifyGreenBarMessage.toString());
        return getTextFromElement(verifyGreenBarMessage);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBar;


    public void clickOnGreenBar() {
        Reporter.log("clickOnGreenBar" + clickOnGreenBar.toString());
        clickOnElement(clickOnGreenBar);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;


    public void mouseHoverOnShoppingCart() {
        Reporter.log("mouseHoverOnShoppingCart" + mouseHoverOnShoppingCart.toString());
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;


    public void hoverAndClickOnGoToCart() {
        Reporter.log("hoverAndClickOnGoToCart" + clickOnGoToCart.toString());
        clickOnElement(clickOnGoToCart);
    }
}
