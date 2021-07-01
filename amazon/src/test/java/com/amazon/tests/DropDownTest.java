package com.amazon.tests;

import com.amazon.pages.ProductNavigating;
import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(DropDownTest.class);
    private ProductNavigating productNavigating;
    public void ddList(){
        productNavigating= PageFactory.initElements(driver,ProductNavigating.class);
    }
    @Test(enabled = false)
    public void validateUserCanDropDown(){
        ddList();
        productNavigating.DropDown();
        ExtentTestManager.log("has been displayed",LOGGER);
    }
    @Test(enabled = false)
    public void valdateUserCanMouseHoover(){
        ddList();
        productNavigating.mouseHooverMethod();
        ExtentTestManager.log("mousehoover has successfully done",LOGGER);

    }
    @Test
    public void validateUserCanSchroolDownToElement(){
        ddList();
        productNavigating.SchroolDownElement();
        ExtentTestManager.log("product has been displayed",LOGGER);
    }
    @Test
    public void validateUserSearchItems(){
        ddList();
       // productNavigating.typeOnSearchBar("java books");
        ExtentTestManager.log("java book has been searched",LOGGER);
        productNavigating.clickOnSearchButton();
        ExtentTestManager.log("search button has been clicked",LOGGER);
    }
    @Test
    public void validateUserCanSchroolDown(){
        ddList();
        productNavigating.ScrollDown();
        ExtentTestManager.log("page schrool displayed successfully",LOGGER);
    }
    @Test
    public void validateUserCanDoIframe(){
        ddList();
        productNavigating.Iframes();
        ExtentTestManager.log("fram has swiched successfully",LOGGER);
    }


}
