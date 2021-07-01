package com.facebook.pages;

import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogInPage {
    private static final Logger LOGGER = Logger.getLogger(LogInPage.class);
    @FindBy(id = "email")
    private WebElement phoneOrEmailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement loggInButton;

    @FindBy(xpath = "//span[contains(text(),'Welcome to Facebook, aali')]")
    private WebElement loginMessage;

    public void phnOrEmailBox() {
        Assert.assertTrue(phoneOrEmailField.isDisplayed());
        phoneOrEmailField.sendKeys("sumon1987@live.com");

    }

    public void passwordFieldBox() {
        Assert.assertTrue(passwordField.isDisplayed());
        passwordField.sendKeys("chittagong321");

    }

    public void clickLoggInButton() {
        Assert.assertTrue(loggInButton.isDisplayed());
        loggInButton.click();
    }


    public void loginValidation() {
        Assert.assertTrue(loginMessage.getText().contains("Welcome to Facebook"));
        ExtentTestManager.log("User being Able to login", LOGGER);

    }
    public void loginFun(){
        phnOrEmailBox();
        passwordFieldBox();
        clickLoggInButton();
    }
}