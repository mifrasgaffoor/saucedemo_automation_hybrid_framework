package dataProvider;

import org.testng.annotations.DataProvider;
import utility.ExcelUtility;

import java.io.IOException;
import java.util.Arrays;

public class ExcelDataProvider {

    @DataProvider(name = "loginData")
    public Object[][] getLoginValidCredentials() throws IOException {
        ExcelUtility excelUtility = new ExcelUtility();
        Object[][] data = excelUtility.readExcel("loginData"); // Read data from Excel
        return data;
    }


}
