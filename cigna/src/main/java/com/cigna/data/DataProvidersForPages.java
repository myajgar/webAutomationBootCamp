package com.cigna.data;

import org.testng.annotations.DataProvider;

public class DataProvidersForPages {



    @DataProvider(name = "getUserForCreateAccountTest")
    public Object[][] getUserForCreateAccountTest() {
        Object[][] data = {{"testusername", "testemail@gmail.com", "testpass"},
                {"testusername2", "testemail2@gmail.com", "testpass2"}};
        return data;

    }
}
