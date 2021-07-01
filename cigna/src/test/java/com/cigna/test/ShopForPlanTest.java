package com.cigna.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.cigna.pages.ShopForPlanPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShopForPlanTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(ShopForPlanTest.class);
    @Test
    public void validateUserCanAbleToShopPlan(){
        ShopForPlanPage shopForPlanPage= PageFactory.initElements(driver,ShopForPlanPage.class);
        shopForPlanPage.searchingForADoctors();
        ExtentTestManager.log("find a doctors has clicked successfully",LOGGER);
        shopForPlanPage.coveredThePlan();
        ExtentTestManager.log(" has been displayed",LOGGER);
        shopForPlanPage.languageCheck();
    }
}
