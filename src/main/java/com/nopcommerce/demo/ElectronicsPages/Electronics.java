package com.nopcommerce.demo.ElectronicsPages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Electronics extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronicsTab;


    public void mouseHoverOnElectronics() {
        Reporter.log("mouseHoverOnElectronics" + mouseHoverOnElectronicsTab.toString());
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhonesAndClick;

    public void mouseHoverOnCellPhonesAndClick() {
        Reporter.log("mouseHoverOnCellPhonesAndClick" + mouseHoverOnCellPhonesAndClick.toString());
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhones;


    public String verifyTextCellPhones() {
        Reporter.log("verifyTextCellPhones" + verifyTextCellPhones.toString());
        return getTextFromElement(verifyTextCellPhones);
    }

}
