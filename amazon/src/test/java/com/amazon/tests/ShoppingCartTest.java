package com.amazon.tests;

import com.amazon.pages.HomePage;
import com.amazon.pages.UsingShoppingCart;
import com.bd.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestBase {

    private SearchTest searchTest;
    private UsingShoppingCart usingShoppingCart;

    @BeforeMethod
    private void pages() {
        searchTest = PageFactory.initElements(driver, SearchTest.class);
        usingShoppingCart = PageFactory.initElements(driver, UsingShoppingCart.class);
    }

    @Test
    public void validateUserAbleToAddToCart() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        searchTest.performSearch("hp computer");
        usingShoppingCart.clickAddToCart();
        usingShoppingCart.addToCartValidation();
    }
}
