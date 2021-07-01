package com.facebook.data;

import org.testng.annotations.DataProvider;

public class DataProvidersPage {
    @DataProvider(name = "FbUserForCreateAccountTest")
    public Object[][] FbUserForCreateAccountTest() {
        Object[][] data = {{"firstname","lastname", "FBemail@gmail.com", "FBpassword"},
                {"firstname2","lastName2" ,"email@gmail.com2", "FBpassword2"}};
        return data;
    }
}
