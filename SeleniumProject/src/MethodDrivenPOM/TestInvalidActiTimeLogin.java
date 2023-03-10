 package MethodDrivenPOM;

import java.io.IOException;

public class TestInvalidActiTimeLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		int rc = flib.getRowCountMethod(EXCEL_PATH, "invaliddata");
		for (int i = 1; i < rc ; i++) {
			
			String invalidUserName = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
			lp.invalidLoginToActiTime(invalidUserName, invalidPassword);
		}

	}

}
