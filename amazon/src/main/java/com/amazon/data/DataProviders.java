package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "DataForBookSearchTest")
    public Object[][] DataForBookSearchTest() {
        Object[][] data = {{"java books"}, {"selenium books"}};
        return data;
    }

    @DataProvider(name = "getUserForCreateAccountTest")
    public Object[][] getUserForCreateAccountTest() {
        Object[][] data = {{"nameofusername", "email@gmail.com", "nameofpassword"},
                {"nameofusername2", "email@gmail.com2", "nameofpassword2"}};
        return data;
    }
}