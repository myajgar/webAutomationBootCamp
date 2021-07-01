package com.cigna.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.cigna.pages.InsurancePlan;
import com.cigna.pages.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(LoginTest.class);
    @Test
    public void validateUserAbleToSignInCigna(){

        LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);

        loginPage.clickOnLoginButton();
        ExtentTestManager.log("loginbutton has been clicked",LOGGER);
        loginPage.typeOnUserName();
        ExtentTestManager.log("username has filled",LOGGER);
        loginPage.clickOnPassword();
        ExtentTestManager.log("passwordfield has fill up",LOGGER);
        loginPage.signInButtonField();
        ExtentTestManager.log("successfully click on login button",LOGGER);


    }
    @Test(enabled = false)
    public void validateUserCanShopAroundForInsurance(){
        InsurancePlan insurancePlan=PageFactory.initElements(driver,InsurancePlan.class);
        insurancePlan.medicareplan();
        ExtentTestManager.log("medicare successfully clicked",LOGGER);
        insurancePlan.medicareplan();
        ExtentTestManager.log("medicarePlan successfully clicked",LOGGER);

    }


}
