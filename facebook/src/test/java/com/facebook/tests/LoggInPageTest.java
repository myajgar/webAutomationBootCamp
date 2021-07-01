package com.facebook.tests;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.facebook.data.DataProvidersPage;
import com.facebook.pages.CreateAnAccountPage;
import com.facebook.pages.LogInPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoggInPageTest extends TestBase {
   private static final Logger LOGGER=Logger.getLogger(LoggInPageTest.class);
   @Test(enabled = false)
    public void validateUserCanAbleToLogin(){
       LogInPage logInPage = PageFactory.initElements(driver,LogInPage.class);

       logInPage.phnOrEmailBox();
       ExtentTestManager.log("userName has displayed",LOGGER);
       logInPage.passwordFieldBox();
       ExtentTestManager.log("password has displayed",LOGGER);
       logInPage.clickLoggInButton();
       ExtentTestManager.log("clicked on sign in button",LOGGER);

   }
   @Test()
   public void validateUserCanCreateAnAccount(){
      CreateAnAccountPage createAnAccountPage=PageFactory.initElements(driver,CreateAnAccountPage.class);
      createAnAccountPage.CreateAccButton();
      createAnAccountPage.typeNameFB();
      ExtentTestManager.log("firstname has displayed",LOGGER);
      createAnAccountPage.typeLastNameFB();
      ExtentTestManager.log("lastname has displayed",LOGGER);
      createAnAccountPage.typeOnEmailFB();
      ExtentTestManager.log("email filled has displayed",LOGGER);
      createAnAccountPage.typePasswordFB();
      ExtentTestManager.log("password has displayed",LOGGER);
      createAnAccountPage.clickGender();
      ExtentTestManager.log("Has clicked",LOGGER);
      createAnAccountPage.hitSignUpButton();
      ExtentTestManager.log("singup button has clicked",LOGGER);
      Assert.assertEquals("","","didn't clicked");

   }
}
