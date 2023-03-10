package MethodDrivenPOM;

import java.io.IOException;

public class testValidActiTimeLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUser = flib.readPropertyData(PROP_PATH, "username1");
		String validPassword = flib.readPropertyData(PROP_PATH, "password1");
		lp.validLoginToActiTime(validUser, validPassword);
		HomePage hp = new HomePage(driver);
		Thread.sleep(3000);
		hp.logOutMethod();
		

	}

}
