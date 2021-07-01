package com.cigna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShopForPlanPage {
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-primary'])[1]")
    private WebElement findDoctors;

    @FindBy(xpath = "(//button[@class='search-button'])[1]")
    private WebElement covered;

    @FindBy(linkText = "English")
    private WebElement language;

    public void searchingForADoctors(){
        Assert.assertTrue(findDoctors.isDisplayed());
    findDoctors.click();}
    public void coveredThePlan(){
        Assert.assertTrue(covered.isDisplayed());
        covered.click();}
    public void languageCheck(){
        Assert.assertTrue(language.isDisplayed());
        language.click();
    }
}

