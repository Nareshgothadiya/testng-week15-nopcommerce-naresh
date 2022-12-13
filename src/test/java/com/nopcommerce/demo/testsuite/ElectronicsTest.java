package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.ElectronicsPages.*;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {

   Electronics electronics;
   Electronics1 electronics1;
   Electronics2 electronics2;
   Electronics3 electronics3;
   Electronics4 electronics4;
   Electronics5 electronics5;
   Electronics6 electronics6;
   Electronics7 electronics7;
   Electronics8 electronics8;
   Electronics9 electronics9;
   Electronics10 electronics10;
   Electronics11 electronics11;
   Electronics12 electronics12;
   Electronics13 electronics13;
   Electronics14 electronics14;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        electronics=new Electronics();
        electronics1=new Electronics1();
        electronics2=new Electronics2();
        electronics3=new Electronics3();
        electronics4=new Electronics4();
        electronics5=new Electronics5();
        electronics6=new Electronics6();
        electronics7=new Electronics7();
        electronics8=new Electronics8();
        electronics9=new Electronics9();
        electronics10=new Electronics10();
        electronics11=new Electronics11();
        electronics12=new Electronics12();
        electronics13=new Electronics13();
        electronics14=new Electronics14();

    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverOnCellPhonesAndClick();
        Assert.assertEquals(electronics.verifyTextCellPhones(), "Cell phones", "Error message not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.mouseHoverOnElectronics();
        electronics.mouseHoverOnCellPhonesAndClick();
        Assert.assertEquals(electronics.verifyTextCellPhones(), "Cell phones", "Error message not displayed");
        electronics1.clickOnListViewTab();
        Thread.sleep(3000);
        electronics1.clickOnProductNameNokia();

        //******************Page Changes to Electronics2*********
        Assert.assertEquals(electronics2.verifyTextNokiaLumia(), "Nokia Lumia 1020", "Error message not displayed");
        Assert.assertEquals(electronics2.verifyNokiaPrice(), "$349.00", "Error message not displayed");
        electronics2.clearQuantity();
        Thread.sleep(4000);
        electronics2.changeQuantityTo2("2");
        Thread.sleep(3000);
        electronics2.clickOnAddToCart();
        electronics2.clickOnGreenBar();
        electronics2.mouseHoverOnShoppingCart();
        electronics2.hoverAndClickOnGoToCart();

        //*****************Page Changes to Electronics3**********
        Assert.assertEquals(electronics3.verifyMessageShoppingCart(), "Shopping cart", "Error message not displayed");
        Assert.assertEquals(electronics3.verifyQuantity(), "(2)", "Error message not displayed");
        Assert.assertEquals(electronics3.verifyTotal(), "$698.00", "Error message not displayed");
        electronics3.clickOnCheckbox();
        electronics3.clickOnCheckout();

        //***************Page Changes to Electronics4***********
        Assert.assertEquals(electronics4.verifyTextWelcomePlease(), "Welcome, Please Sign In!", "Error message not displayed");
        electronics4.clickOnRegister();

        //***************Page Changes to Electronics5*************
        Assert.assertEquals(electronics5.verifyTextRegister(), "Register", "Error message not displayed");
        Thread.sleep(2000);
        electronics5.sendTextToFirstNameField("Naresh");
        electronics5.sendTextToLastNameField("Prime");
        electronics5.sendTextToEmailField("selenium5600@gmail.com");
        electronics5.sendTextToPasswordField("123456");
        electronics5.sendTextToConfirmPasswordField("123456");
        electronics5.clickOnRegister1();

        //***************Page Changes to Electronics6******************
        Assert.assertEquals(electronics6.verifyMessageYourRegistrationCompleted(), "Your registration completed", "Error message not displayed");
        electronics6.clickOnContinue();

        //**************Page Changes to Electronics7********************
        Assert.assertEquals(electronics7.verifyTextShoppingCart(), "Shopping cart", "Error message not displayed");
        electronics7.clickOnCheckbox1();
        electronics7.clickOnCheckout1();

        //***********Page Changes to Electronics8******************
        electronics8.countryByVisibleText("United Kingdom");
        electronics8.sendTextToCity("London");
        electronics8.sendTextToAddress("avenue");
        electronics8.sendTextToPostelCode("AB1 2CD");
        electronics8.sendTextToPhoneNumber("01234567890");
        electronics8.clickOnContinue1();

        //***********Page Changes Electronics9*******************
        electronics9.clickOn2ndDayAir();
        electronics9.clickOnContinue2();

        //**********Page Changes to Electronics10***************
        electronics10.clickOnCreditCard();
        electronics10.clickOnContinueTab();

        //***********Page Changes to Electronics11*************
        electronics11.clickOnSelectCreditCard();
        //electronics.clickOnVisa();
        electronics11.sendTextToCardholderName("selenium");
        electronics11.sendTextToCardNumber("1111222233334444");
        electronics11.sendTextToExpirationMonth("9");
        electronics11.sendTextToExpirationYear("2025");
        electronics11.sendTextToCardCode("789");
        electronics11.clickOnContinue3();

        //***********Page Changes to Electronics12********************
        Assert.assertEquals(electronics12.verifyPaymentMethod(), "Credit Card", "Error message not displayed");
        Assert.assertEquals(electronics12.verifyShopingMethod(), "2nd Day Air", "Error message not displayed");
        Assert.assertEquals(electronics12.verifyTotalPrice(), "$698.00", "Error message not displayed");
        electronics12.clickOnConfirm();

        //*****************Page Changes to Electronics13****************
        Assert.assertEquals(electronics13.verifyTextThankYou(), "Thank you", "Error message not displayed");
        Assert.assertEquals(electronics13.verifySuccessfully(), "Your order has been successfully processed!", "Error message not displayed");
        electronics13.clickOnContinue4();

        //*****************Page Changes to Electronics14********************
        Assert.assertEquals(electronics14.verifyWelcomeToOurStore(), "Welcome to our store", "Error message not displayed");
        electronics14.clickOnLogout();
        Assert.assertEquals(electronics14.verifyCurrentURL(), "https://demo.nopcommerce.com/", "Error message not displayed");

    }
}
