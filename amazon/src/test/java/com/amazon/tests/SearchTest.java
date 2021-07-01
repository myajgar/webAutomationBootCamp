package com.amazon.tests;

import com.amazon.pages.HomePage;
import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchTest extends TestBase {
  private static final   Logger LOGGER =Logger.getLogger(SearchTest.class);
    private HomePage homePage;
    @BeforeMethod
    private void pages(){

        homePage= PageFactory.initElements(driver,HomePage.class);
    }

    public void performSearch(String itme){

        homePage.typeOnSearch(itme);
        homePage.clickSearchBtn();
        homePage.searchValidation();
        homePage.clickHp();
    }

    @Test
    public void validateUserCanSearchForSeleniumBooks(){
      performSearch("hp computer");

    }


}
