package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.ElectronicsPages.*;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest1 extends BaseTest {

    Computer computer;
    ComputerPage1 computerPage1;
    ComputerPage2 computerPage2;
    ComputerPage3 computerPage3;
    ComputerPage4 computerPage4;
    ComputerPage5 computerPage5;
    ComputerPage6 computerPage6;
    ComputerPage7 computerPage7;
    ComputerPage8 computerPage8;
    ComputerPage9 computerPage9;
    ComputerPage10 computerPage10;
    ComputerPage11 computerPage11;
    ComputerPage12 computerPage12;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computer =new Computer();
        computerPage1=new ComputerPage1();
        computerPage2=new ComputerPage2();
        computerPage3=new ComputerPage3();
        computerPage4=new ComputerPage4();
        computerPage5=new ComputerPage5();
        computerPage6=new ComputerPage6();
        computerPage7=new ComputerPage7();
        computerPage8=new ComputerPage8();
        computerPage9=new ComputerPage9();
        computerPage10=new ComputerPage10();
        computerPage11=new ComputerPage11();
        computerPage12=new ComputerPage12();
        computerPage1=new ComputerPage1();

    }


    //********************ComputerPage1*********2.1 to 2.37******
    @Test(groups = {"sanity", "smoke"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage1.clickOnComputer();
        computerPage1.clickOnDesktop();

        //**********Page Changes to ComputerPage2**************
        computerPage2.getSelectByValue("5");
        computerPage2.clickOnAddToCart();

        //**********Page Changes to ComputerPage3**************
        Assert.assertEquals(computerPage3.getVerifyBuildYourOwn(), "Build your own computer", "Error message not displayed");
        computerPage3.selectProcessorByValue("1");
        computerPage3.selectRamByValue("5");
        computerPage3.clickOnHDD400GB();
        computerPage3.clickOnOsVistaPremium();
        computerPage3.clickOnSoftwareTotalCommander();
        //Assert.assertEquals(computer3.verifyTotalPrice(), "$1,475.00", "Error message not displayed");
        computerPage3.clickOnAddToCartButton();
        Assert.assertEquals(computerPage3.verifyCaryMessage(), "The product has been added to your shopping cart", "Error message not displayed");
        computerPage3.closeMessageBar();
        computerPage3.mouseHoverOnElementShoppingCart();
        computerPage3.clickOnGoToCart();

        //**********Page Changes to ComputerPage4**************
        computerPage4.clearTextInQuantityField();
        computerPage4.sendTextToQuantityField();
        computerPage4.clickOnUpdateShoppingCartButton();
        //Assert.assertEquals(computerPage4.verifyTotal2950(), "$2,950.00", "Error message not displayed");
        computerPage4.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage4.clickOnCheckOutButton();

        //**********Page Changes to ComputerPage5**************
        Assert.assertEquals(computerPage5.verifyWelcomeText(), "Welcome, Please Sign In!", "Error message not displayed");

        //**********Page Changes to ComputerPage6**************
        computerPage6.clickOnCheckOutAsGuest();
        computerPage6.sendTextToFirstNameField("Prime");
        computerPage6.sendTextToLastNameField("Testing");
        computerPage6.sendTextToEmailField("seleniumm15693@gmail.com");
        computerPage6.sendTextToCompanyField("Primetest");
        computerPage6.selectCountryFromDropDownList();
        computerPage6.sendTextToCityField("London");
        computerPage6.sendTextToAddressLine1("lathi");
        computerPage6.sendTextToAddressLine2("Adtala");
        computerPage6.sendTextToPostcode("HA3 9UY");
        computerPage6.sendTextToPhoneNumberField("07757865425");
        computerPage6.clickOnContinueButton();

        //**********Page Changes to ComputerPage7**************
        computerPage7.clickOnNextDayAirButton();
        computerPage7.clickOnContinueButtonAgain();

        //**********Page Changes to ComputerPage8**************
        computerPage8.clickOnCreditCardButton();
        computerPage8.selectClickOnContinue1();

        //**********Page Changes to ComputerPage9**************
        computerPage9.selectMasterCardFromCreditCardDropdown("MasterCard");
        computerPage9.sendTextTOCardHolderName("testng");
        computerPage9.sendTextTOCardNumber("1111222233334444");
        computerPage9.selectMonthAndYearForCreditCardExpireData();
        computerPage9.sendTextToCardCode("235");
        computerPage9.clickOnContinueButton2();

        //**********Page Changes to ComputerPage10**************
        Thread.sleep(2000);
        Assert.assertEquals(computerPage10.getVerifyText1(), "Credit Card", "Error Message not displayed");
        Assert.assertEquals(computerPage10.getVerifyText2(), "Next Day Air", "Error Message not displayed");
        //Assert.assertEquals(computerPage10.getVerifyText3(), "$2,950.00", "Error Message not displayed");
        computerPage10.clickOnConformButton();

        //**********Page Changes to ComputerPage11**************
        Assert.assertEquals(computerPage11.getVerifyText4(), "Checkout", "Error Message not displayed");
        Assert.assertEquals(computerPage11.getVerifyText5(), "Your order has been successfully processed!", "Error Message not displayed");
        computerPage11.clickOnContinueButton3();

        //**********Page Changes to ComputerPage12**************
        Thread.sleep(2000);
        //Assert.assertEquals(computerPage12.getVerifyText3(), "Welcome to our store", "Error Message not displayed");
    }
}
