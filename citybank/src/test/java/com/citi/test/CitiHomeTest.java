package com.citi.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.citi.pages.CreditCardPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CitiHomeTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(CitiHomeTest.class);

    @Test()
    public void validateUserCanOpenCreditCard(){
        //CitiHomePage citiHomePage = PageFactory.initElements(driver,CitiHomePage.class);
        CreditCardPage creditCardPage=PageFactory.initElements(driver,CreditCardPage.class);
        creditCardPage.searchCreditCard();
        ExtentTestManager.log("clicked on view all creditcard",LOGGER);
        creditCardPage.creditCardType();
        ExtentTestManager.log("few card has displayed",LOGGER);
        creditCardPage.applyOnCreditCard();
        ExtentTestManager.log("credit card aply option has displayed",LOGGER);
        creditCardPage.cardBeniFits();
        ExtentTestManager.log("card benifit has clicked",LOGGER);
       // creditCardPage.firstNameField();




    }


}
