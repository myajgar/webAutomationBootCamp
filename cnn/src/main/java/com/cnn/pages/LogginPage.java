package com.cnn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogginPage {

    @FindBy(xpath = "//div[@id='nav__plain-header']//div[6]//div[1]//*[local-name()='svg']")
    private WebElement account;

    @FindBy(name = "loginEmail")
    private WebElement emailAddress;

    @FindBy(name = "loginPassword")
    private WebElement passAddress;

    @FindBy(id= "login-form-button")
    private WebElement login;

    public void accountopen() {
        Assert.assertTrue(account.isDisplayed());
        account.click();
    }

    public void typeInEmailField() {
        Assert.assertTrue(emailAddress.isDisplayed());
        emailAddress.sendKeys("abc@gmail.com");
    }

    public void typeInPassWordField() {
        Assert.assertTrue(passAddress.isDisplayed());
        passAddress.sendKeys("123456");
    }

    public void logINField() {
        Assert.assertTrue(login.isDisplayed());
        login.click();
    }
}
