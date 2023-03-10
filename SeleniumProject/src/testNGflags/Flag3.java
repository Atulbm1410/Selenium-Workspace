package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
  @Test(priority = 1)
  public void loginMethod() {
	  
	  Reporter.log("login method", true);
  }
  
  @Test(priority = 2)
  public void createUser() {
	  
	  Reporter.log("create user method", true);
  }
  
  @Test(priority = 3)
  public void logoutMethod() {
	  
	  Reporter.log("logout method", true);
  }
}
