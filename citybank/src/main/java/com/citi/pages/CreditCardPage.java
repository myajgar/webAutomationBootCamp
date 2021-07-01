package com.citi.pages;

import com.bd.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreditCardPage {
    @FindBy(id = "navcreditCardmainAnchor0")
    private WebElement cardName;

    @FindBy(xpath = "(//button[@class='btn btn-primary default noMargin'])[1]")
    private WebElement viewcard;

    @FindBy(xpath = "(//button[@class='btn btn-primary default noMargin'])[1]")
    private WebElement selectcard;

    @FindBy(id = "mkt-0-tab-1")
    private WebElement cardBeni;

    @FindBy(xpath = "//input[@id='FIRST_NAME']")
    private WebElement name;

    public void searchCreditCard() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(cardName).build().perform();
        TestBase.driver.findElement(By.id("View All Credit CardschildLink0")).click();
    }
    public void creditCardType(){
        viewcard.click();
    }
    public void applyOnCreditCard(){
        selectcard.click();
    }
    public void cardBeniFits(){
        cardBeni.click();
    }
    public void firstNameField(){
        name.sendKeys("abcd");
    }



}

/*
WebElement x = driver.findElement(By.linkText(""));
        Actions actions = new Actions(driver);
        actions.moveToElement(x).build().perform();
        driver.findElement(By.linkText("y")).click();
 */