package com.cnn.test;

import com.bd.base.TestBase;
import com.bd.base.report.ExtentTestManager;
import com.cnn.pages.NewsPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewsTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(NewsTest.class);

    @Test
    public void validateUserCanAbleToReadNews() {
        NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
        newsPage.clickedOnSportsNews();
        ExtentTestManager.log("sports bar has clicked ",LOGGER);
    }
        @Test
        public void validateUserCanChooseOptionFrmMouseHoover() {

            NewsPage newsPage = PageFactory.initElements(driver, NewsPage.class);
            newsPage.clickedOnSportsNews();
            newsPage.nbaSports();
        }
}
