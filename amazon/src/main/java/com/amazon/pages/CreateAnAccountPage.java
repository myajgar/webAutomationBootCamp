package com.amazon.pages;

import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreateAnAccountPage {
private static final Logger LOGGER =Logger.getLogger(CreateAnAccountPage.class);
    @FindBy(id = "ap_customer_name")
    private WebElement nameField;
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    @FindBy(id = "ap_password_check")
    private WebElement reEnterPasswordField;
    //for validation
    @FindBy(xpath = "//label[@for='ap_customer_name']")
    private WebElement NameFieldCheck;
    @FindBy(xpath = "//label[@for='ap_email']")
    private WebElement EmailLabelCheck;
    @FindBy(xpath = "//label[@for='ap_password']")
    private WebElement PasswordLabelCheck;
    @FindBy(xpath = "//label[@for='ap_password_check']")
    private WebElement ReEnterPasswordLabelCheck;

    private void validateTheFieldLabel(){
        Assert.assertTrue(NameFieldCheck.isDisplayed());
        ExtentTestManager.log("namefield has been displayed",LOGGER);
        Assert.assertTrue(EmailLabelCheck.isDisplayed());
        ExtentTestManager.log("emaillabel displayed",LOGGER);
        Assert.assertTrue(PasswordLabelCheck.isDisplayed());
        ExtentTestManager.log("passwordlabel has displayed",LOGGER);
        Assert.assertTrue(ReEnterPasswordLabelCheck.isDisplayed());
        ExtentTestManager.log("has displayed",LOGGER);
    }

    public void typeInNameField(String data) { nameField.sendKeys(); }
    public void typeInEmailField(String data) {
        emailField.sendKeys();
    }
    public void typeInPasswordField(String data) { passwordField.sendKeys(); }
    public void typeInReEnterPasswordField(String data) {
        reEnterPasswordField.sendKeys();
    }

}
