package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage1 extends Utility {
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
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;


}
