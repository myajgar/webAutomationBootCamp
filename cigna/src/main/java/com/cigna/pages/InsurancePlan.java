package com.cigna.pages;

import com.bd.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InsurancePlan {

    @FindBy(id = "medicare-level-one-link")
    private WebElement medicarePlan;

    @FindBy(xpath = "//input[@id='zip-314']")
    private WebElement zipCode;

    @FindBy(css = "#planfinder-314 > div.input-holder.input-optional > div > button")
    private WebElement planLookUp;

    @FindBy(linkText = " Prescription Drug Plans")
    private WebElement PAndDPlan;

    @FindBy(xpath = "//input[@id='uxFieldZipCode']")
    private WebElement fieldOfZipCode;

    public void medicarePlanForFam() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(medicarePlan).build().perform();
        TestBase.driver.findElement(By.linkText("Shop Medicare Advantage Plans")).click();

    }

    public void shopForPlan() {
        Assert.assertTrue(planLookUp.isDisplayed());
        planLookUp.click();
    }

    public void typeOnZipCode() {
        Assert.assertTrue(zipCode.isDisplayed());
        zipCode.sendKeys("06902");
    }

    public void PrescriptionAndDrugPlan() {
        Assert.assertTrue(PAndDPlan.isDisplayed());
        PAndDPlan.click();
    }

    }




