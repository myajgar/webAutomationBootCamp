package com.amazon.pages;

import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    private Logger logger = Logger.getLogger(HomePage.class);
    @FindBy(id = "twotabsearchtextbox")
    private WebElement serchBox;

    @FindBy(id = "nav-search-submit-button")//for POM
    private WebElement searchButton;
    @FindBy(xpath = "//span[contains(text(),'computer')]")//for POM
    private WebElement searchMessage;
    @FindBy(xpath = "(//span[contains(text(),'HP')])[1]")
    private WebElement  hpComputer;



   public void typeOnSearch(String data){
       Assert.assertTrue(serchBox.isDisplayed()&& serchBox.isEnabled());
       serchBox.sendKeys(data);
       ExtentTestManager.log(data+" has been Tayped on search box",logger);
   }

    public void clickSearchBtn(){
        Assert.assertTrue(searchButton.isDisplayed());
        searchButton.click();
        ExtentTestManager.log("search button has been clicked",logger);
    }

    public void searchValidation(){
       Assert.assertTrue(searchMessage.isDisplayed());
       ExtentTestManager.log("the user can search for itmes",logger);

    }
    public void clickHp(){
       hpComputer.click();
    }







}




