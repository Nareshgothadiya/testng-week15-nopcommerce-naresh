package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics1 extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronics;


    public void mouseHoverOnElectronics() {
        Reporter.log("mouseHoverOnElectronics" + mouseHoverOnElectronics.toString());
        mouseHoverToElement(mouseHoverOnElectronics);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhones1;


    public void mouseHoverOnCellPhones1() {
        Reporter.log("mouseHoverOnCellPhones1" + mouseHoverOnCellPhones1.toString());
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellphones;


    public String verifyTextCellphones() {
        Reporter.log("verifyTextCellphones" + verifyTextCellphones.toString());
        return getTextFromElement(verifyTextCellphones);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListViewTab;


    public void clickOnListViewTab() {
        Reporter.log("clickOnListViewTab" + clickOnListViewTab.toString());
        clickOnElement(clickOnListViewTab);
    }


    @CacheLookup
    @FindBy(xpath = "//img[@alt ='Picture of Nokia Lumia 1020']")
    WebElement clickOnProductNameNokia;


    public void clickOnProductNameNokia() {
        Reporter.log("clickOnProductNameNokia" + clickOnProductNameNokia.toString());
        clickOnElement(clickOnProductNameNokia);
    }
}
