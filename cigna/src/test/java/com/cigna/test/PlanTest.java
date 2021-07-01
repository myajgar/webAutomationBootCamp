package com.cigna.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.cigna.pages.InsurancePlan;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlanTest extends TestBase {
    private static final Logger LOGGER =Logger.getLogger(PlanTest.class);
    @Test
    public void validateUserCanCreateAccountToTakeCoverage(){
        InsurancePlan insurancePlan = PageFactory.initElements(driver,InsurancePlan.class);
        insurancePlan.medicarePlanForFam();
        ExtentTestManager.log("field has been clicked",LOGGER);

        insurancePlan.typeOnZipCode();
        ExtentTestManager.log("zipcode has displayed",LOGGER);

        insurancePlan.shopForPlan();
        ExtentTestManager.log("Page has  clicked",LOGGER);

        ExtentTestManager.log("dentalPlan has been displayed",LOGGER);
        insurancePlan.PrescriptionAndDrugPlan();
        ExtentTestManager.log("quotefield has been displayed",LOGGER);








        insurancePlan.firstName();
        ExtentTestManager.log("firstName has been filled up",LOGGER);
        insurancePlan.lastName();
        ExtentTestManager.log("lastName has been filled up",LOGGER);
        insurancePlan.emailField();
        ExtentTestManager.log("emailField has been filled up",LOGGER);
        insurancePlan.phoneField();
        ExtentTestManager.log("phone number has displayed",LOGGER);
        insurancePlan.getZipCodes();
        ExtentTestManager.log("zipcodes has been filled up",LOGGER);
        insurancePlan.startDate();
        ExtentTestManager.log("startdate has displayed",LOGGER);

    }
}