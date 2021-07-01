package com.citi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage {
    @FindBy(xpath = "//input[@id='username']")
    private WebElement userId;

    @FindBy(css = "#password")
    private WebElement passcode;

    @FindBy(css = "#signInBtn")
    private WebElement signOn;

    public void typeUserID(String data){
        Assert.assertTrue(userId.isDisplayed());
        userId.sendKeys(data);
    }
    public void typePassCOde(String data){
        Assert.assertTrue(passcode.isDisplayed());
        passcode.sendKeys(data);
    }
    public void clkSignOn(){
        Assert.assertTrue(signOn.isDisplayed());
        signOn.click();
    }

    public void user(){
       userId.sendKeys("abc@gmail.com");
   }
    public void pass(){
        passcode.sendKeys("abc1234");
    }
   public void signOnBuTTon(){
       signOn.click();
    }

}
