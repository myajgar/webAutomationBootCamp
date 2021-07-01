package com.cnn.test;

import com.bd.base.TestBase;
import com.cnn.pages.LogginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogginTest extends TestBase {
    private static final Logger LOGGER=Logger.getLogger(LogginTest.class);

    @Test
    public void validateUserCanLogginToCnn()  {
    LogginPage logginPage = PageFactory.initElements(driver,LogginPage.class);
    logginPage.accountopen();
    logginPage.typeInEmailField();
    logginPage.typeInPassWordField();
    logginPage.logINField();
    }

}
