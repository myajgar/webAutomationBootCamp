package com.cnn.pages;

import com.bd.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsPage {

    @FindBy(xpath = "(//a[@title='visit the Sports section'])[1]")
    private WebElement sportsNews;

    @FindBy(css ="#nba > a")
    private WebElement NBA;

    public void clickedOnSportsNews(){
        Assert.assertTrue(sportsNews.isDisplayed());
        sportsNews.click();
    }

    public void nbaSports() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(NBA).build().perform();
        TestBase.driver.findElement(By.linkText("Brooklyn")).click();
        Assert.assertTrue(NBA.isDisplayed());
    }

}
