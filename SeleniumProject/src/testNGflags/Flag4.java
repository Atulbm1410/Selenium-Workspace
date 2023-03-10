package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test(enabled = false)
  public void createUser() {
	  
	  Reporter.log("Create User Method", true);
  }
  
  @Test(enabled = true)
  public void login() {
	  
	  Reporter.log("logging in.....", true);
  }
}
