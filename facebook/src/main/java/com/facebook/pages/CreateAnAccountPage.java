package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CreateAnAccountPage {
    @FindBy(xpath = " //a[contains(text(),'Create New Account')]")
    private WebElement creAccBu;

    @FindBy(name = "firstname")
    private WebElement firstNameFb;

    @FindBy(name = "lastname")
    private WebElement lastNameFB;

    @FindBy(name= " reg_email__")
    private WebElement phnOrEmailFB;

    @FindBy(name= "reg_passwd__")
    private WebElement passwordFB;

    @FindBy(name = "birthday_month")
    private WebElement bdMonthFB;

    @FindBy(name = "birthday_day")
    private WebElement bdDayFB;

    @FindBy(name= "birthday_year")

    private WebElement bdYearFB;
    @FindBy(xpath =  "(//input[@name='sex'])[2]")
    private WebElement genderFB;

    @FindBy(xpath = " //button[contains(text(),'Sign Up')and@name='websubmit']")
    private WebElement signUpButton;

    @FindBy(xpath = "//h2[contains(text(),'Enter')and @aria-hidden='true']")
    private WebElement message;

    public void CreateAccButton() {
        Assert.assertTrue(creAccBu.isDisplayed());
        creAccBu.click();
    }

    public void typeNameFB() {
        Assert.assertTrue(firstNameFb.isDisplayed());
        firstNameFb.sendKeys("ajgar");

    }

    public void typeLastNameFB() {
        Assert.assertTrue(lastNameFB.isDisplayed());
        lastNameFB.sendKeys("ali");
    }

    public void typeOnEmailFB() {
        Assert.assertTrue(phnOrEmailFB.isDisplayed());
        phnOrEmailFB.sendKeys("sumon1987@live.com");
    }

    public void typePasswordFB() {
        passwordFB.sendKeys("abc123");
    }

    public void typeMonth() {
        Select select = new Select(bdMonthFB);
        select.selectByVisibleText("jun");

    }

    public void typeDay() {
        Select select = new Select(bdDayFB);
        select.selectByVisibleText("10");

    }

    public void typeYear() {
        Select select = new Select(bdDayFB);
        select.selectByVisibleText("1987");


    }

    public void clickGender() {
        genderFB.click();
    }

    public void hitSignUpButton() {
        signUpButton.click();
    }

    public void creationValidation() {
        String expected = "Enter the code from your email";
        Assert.assertTrue(message.getText().contains(expected));


    }
}