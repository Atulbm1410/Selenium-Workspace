package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "this method is used to log in")
  public void flag1() {
	  
	  Reporter.log("Logging in......",true);
  }
  
  @Test(description = "this method is used to perform log out")
  public void flag2() {
	  
	  Reporter.log("Logging Out....", true);
  }
}
