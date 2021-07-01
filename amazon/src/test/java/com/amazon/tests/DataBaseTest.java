package com.amazon.tests;

import com.amazon.pages.HomePage;
import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.ArrayList;

public class DataBaseTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(DataBaseTest.class);
     private HomePage homePage;
    @Test
    public void validateUserAbleToSearchFromDb() throws SQLException {
        ArrayList<String> data = conectionAndGetDataFromDataBase();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearch(data.get(1));
        ExtentTestManager.log("search result has been displayed",LOGGER);
        homePage.clickSearchBtn();
        ExtentTestManager.log("search button has clicked",LOGGER);


    }
    @Test
    public void validateUserCanSearchItemsFromDataBase() throws SQLException {
        ArrayList<String>data2=conectionAndGetDataFromDataBase();
        homePage=PageFactory.initElements(driver,HomePage.class);
        homePage.typeOnSearch(data2.get(0));
        ExtentTestManager.log("the search items found successfully",LOGGER);
        homePage.clickSearchBtn();
        ExtentTestManager.log("items has displayed",LOGGER);
    }


}
