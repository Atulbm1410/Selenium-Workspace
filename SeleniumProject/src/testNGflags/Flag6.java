package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	 @Test
	  public void loginMethod() {
		  
		  Reporter.log("login method", true);
	  }
	  
	  @Test(dependsOnMethods = "loginMethod")
	  public void createUser() {
		  
		  Reporter.log("create user method", true);
	  }
	  
	  @Test(priority = 1)
	  public void logoutMethod() {
		  
		  Reporter.log("logout method", true);
	  }
}
