package com.amazon.pages;

import com.bd.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ProductNavigating {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(id = "searchDropdownBox")
    private WebElement categoryDropDown;

    @FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement mouseHooverVar;

    @FindBy(linkText = "Explore more")
    private WebElement element;

    public void typeOnSearchBar(String txt) {
        searchTextBox.sendKeys(txt);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }


        public void DropDown() {
        Select select = new Select(categoryDropDown);
        select.selectByVisibleText("Baby");


    }

        public void mouseHooverMethod() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(mouseHooverVar).build().perform();
        TestBase.driver.findElement(By.linkText("Orders")).click();
    }

        public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("window.scrollBy(0,1000)");

    }

        public void SchroolDownElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void Iframes() {

        TestBase.driver.switchTo().frame("frame2");
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;
        js.executeScript("window.scrollBy(0,1000)");
        TestBase.driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(0,1000)");
    }
}


