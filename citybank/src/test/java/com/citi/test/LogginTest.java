package com.citi.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.citi.data.DataProvidersForCiti;
import com.citi.pages.SignInPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogginTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(LogginTest.class);

    @Test
    public void validateUserCanSignIn(){
        SignInPage signInPage =PageFactory.initElements(driver,SignInPage.class);
        signInPage.user();
        ExtentTestManager.log("userid has displayed",LOGGER );
        signInPage.pass();
        ExtentTestManager.log("password field has displayed",LOGGER);
        signInPage.signOnBuTTon();
        ExtentTestManager.log("signIn Button has clicked",LOGGER);
    }

    @Test( enabled = false , dataProviderClass = DataProvidersForCiti.class,dataProvider = "getUserForSignOnTest")
    public void validateUserCanLogInCitiBank(String name,String password){
        SignInPage signInPage = PageFactory.initElements(driver,SignInPage.class);
        signInPage.typeUserID(name);
        ExtentTestManager.log("name filled displayed",LOGGER);
        signInPage.typePassCOde(password);
        ExtentTestManager.log("password has displayed",LOGGER);
        signInPage.clkSignOn();
        ExtentTestManager.log("signon button has clicked",LOGGER);
        Assert.assertEquals("","","did not clicked");
    }
}
