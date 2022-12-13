package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.ElectronicsPages.*;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    //************************************HomePage**************************
    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputer() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(homePage.getVerifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test(groups = {"sanity", "smoke"})
    public void verifyUserShouldNavigateToElectronics() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToApparel() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }
}
