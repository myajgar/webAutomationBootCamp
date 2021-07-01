package com.amazon.pages;


import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class UsingShoppingCart {
    private Logger logger = Logger.getLogger(UsingShoppingCart.class);

    @FindBy(id="add-to-cart-button")
    private WebElement addToCart;
    @FindBy(xpath="(//input[@class='a-button-input'])[2]")
    private WebElement noThanks;
    @FindBy(xpath = "(//input[starts-with(@name,'submit')])[1]")
    private WebElement delet;
    public void clickAddToCart(){
        Assert.assertTrue(addToCart.isDisplayed());
        addToCart.click();
        ExtentTestManager.log("add to cart is clicked",logger);
        noThanks.click();
        TestBase.driver.navigate().refresh();
    }



    public void addToCartValidation(){
        TestBase.driver.navigate().to("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
        Assert.assertTrue(delet.isDisplayed());
        ExtentTestManager.log("user able to add to cart",logger);

    }


}
