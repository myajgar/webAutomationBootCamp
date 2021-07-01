package com.cigna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-primary'])[2]")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameField ;

    @FindBy(xpath = "//*[@id=password]")
    private WebElement passwordField ;
    @FindBy(xpath = "//*[@id=loginbutton]")
    private WebElement signInButtonClk ;



    public void clickOnLoginButton() {
        Assert.assertTrue(loginField.isDisplayed());
        loginField.click();
    }
    public void typeOnUserName(){
        Assert.assertTrue(userNameField.isDisplayed());
        userNameField.sendKeys("sumon111@gmail.com");
    }
    public void clickOnPassword(){
        Assert.assertTrue(passwordField.isDisplayed());
        passwordField.sendKeys("asdfg123");
    }
    public void signInButtonField(){
        Assert.assertTrue(signInButtonClk.isDisplayed());
        signInButtonClk.click();
    }



}
