package com.facebook.tests;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.facebook.pages.HomePages;
import com.facebook.pages.LogInPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(HomePageTest.class);

    @Test()
    public void validateUserCanSendFriendsRequest() {
        HomePages homePages = PageFactory.initElements(driver, HomePages.class);
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);

        logInPage.loginFun();
        ExtentTestManager.log("homepage has displayed", LOGGER);

        homePages.clickOnFriendsButton();

        homePages.confirmTheFriends();
        ExtentTestManager.log("friends option has clicked", LOGGER);

        homePages.FriendsRequestConfirm();
        ExtentTestManager.log("friends request button has clicked", LOGGER);

        homePages.searchOnFriends();
        ExtentTestManager.log("serach box has clicked", LOGGER);
    }

    @Test
    public void validateUserCanlikeTheLikeButton() {
        HomePages homePage = PageFactory.initElements(driver, HomePages.class);
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.loginFun();
        homePage.clickOnLikeButton();
        ExtentTestManager.log("Like button has clicked", LOGGER);
    }
    @Test
            public void validateUserCanCommentOnFriends(){
        HomePages homePage = PageFactory.initElements(driver, HomePages.class);
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.loginFun();
        homePage.clikOnCommentBox();
        ExtentTestManager.log("comment button has clicked",LOGGER);
        homePage.TypeOnCommentSome("hello");
        ExtentTestManager.log("comment box has filled by comment", LOGGER);


    }
}
