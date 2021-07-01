package com.citi.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForCiti {

    @DataProvider(name = "getUserForSignOnTest")
    public Object[][] getUserForSignOnTest() {
        Object[][] data = {{"username",  "password"},
                {"username2", "password2"}};
        return data;
    }
}