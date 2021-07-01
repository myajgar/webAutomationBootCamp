package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(xpath = "(//span[@class='nav-action-inner'])[2]")
    private WebElement signInButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAccountButton;


    public void createAccount(){
        createAccountButton.click();
    }
    public void ClickOnSignInButton(){
        signInButton.click(); }

}

