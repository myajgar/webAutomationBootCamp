package com.facebook.pages;

import com.bd.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePages {
    private static final Logger LOGGER=Logger.getLogger(HomePages.class);
    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[15]")
    private WebElement friends;

    @FindBy(xpath =  "//div[contains(@class,'k4urcfbm')]//div[@aria-label='Confirm']")
    private WebElement confirmButton;


    @FindBy(xpath =  "//div[contains(@class,'k4urcfbm')]//span[contains(text(),'Request confirmed')]")
    private WebElement confirmFranRequest;

    @FindBy(xpath = "//input[@name='global_typeahead']")
    private WebElement searchFriends;


    @FindBy(xpath = "(//div[contains(@class,'rq0escxv')]//div[@aria-label='Like'])[1]")
    private WebElement likeButton;

    @FindBy(xpath = "(//span[contains(@class,'tojvnm2t')]//div[@role='button'])[13]")
    private WebElement likeText;

    @FindBy(xpath = "(//p[@class='hcukyx3x oygrvhab cxmmr5t8 kvgmc6g5'])[1]")
    private WebElement commentBox;


    @FindBy(xpath =  "//div[contains(text(),'azul')]")
    private WebElement commentWrite;


   public void clickOnFriendsButton(){
       Assert.assertTrue(friends.isDisplayed());
       friends.click();
   }

   public void confirmTheFriends(){
       Assert.assertTrue(confirmButton.isDisplayed());
       confirmButton.click();
   }
   public void searchOnFriends(){
       Assert.assertTrue(searchFriends.isDisplayed());
       searchFriends.click();}

    public void FriendsRequestConfirm(){
        Assert.assertTrue(confirmFranRequest.isDisplayed());
        confirmFranRequest.click();
    }

    public void clickOnLikeButton() {
        Assert.assertTrue(likeText.getText().contains("You"));
        likeButton.click();
    }
    public void clikOnCommentBox(){
        Assert.assertTrue(commentBox.isDisplayed());
        commentBox.click();


    }
    public void TypeOnCommentSome(String text){
        Assert.assertTrue(commentWrite.isDisplayed());
        Actions actions = new Actions(TestBase.driver);
        commentWrite.sendKeys(text);
        actions.sendKeys(Keys.ENTER).perform();
    }

    }





