package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flat7 {
	 @Test
	  public void loginMethod() {
		 
		 int result = 5/0;
		 System.out.println(result);
		 Reporter.log("login method", true);
	  }
	  
	  @Test(dependsOnMethods = "loginMethod")
	  public void createUser() {
		  
		  Reporter.log("create user method", true);
	  }
	  
	  @Test(dependsOnMethods = "loginMethod", alwaysRun = true)
	  public void logoutMethod() {
		  
		  Reporter.log("logout method", true);
	  }
}
