package com.amazon.tests;

import com.amazon.data.DataProviders;
import com.amazon.pages.CreateAnAccountPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoggingTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoggingTest.class);

    @Test(dataProviderClass = DataProviders.class,dataProvider ="getUserForCreateAccountTest")
    public void validateUserCanCreateAccount(String username,String email,String password) {
        CreateAnAccountPage createAnAccountPage = PageFactory.initElements(driver, CreateAnAccountPage.class);
        SignInPage signInPage =PageFactory.initElements(driver,SignInPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage.ClickOnSignInButton();
        ExtentTestManager.log("signIn button has clicked",LOGGER);
        signInPage.createAccount();
        ExtentTestManager.log("CreateAccount button has been clicked", LOGGER);
        createAnAccountPage.typeInNameField(username);
        ExtentTestManager.log("user can put his name", LOGGER);
        createAnAccountPage.typeInEmailField(email);
        ExtentTestManager.log("email has been displayed", LOGGER);
        createAnAccountPage.typeInPasswordField(password);
        ExtentTestManager.log("password is there", LOGGER);
        createAnAccountPage.typeInReEnterPasswordField(password);
        ExtentTestManager.log("re-enter password has displayed ",LOGGER);


    }
}