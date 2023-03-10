package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
  @Test(invocationCount = 10)
  public void loginButtonEnabledDisabled() {
	  
	  Reporter.log("disabled!!", true);
  }
}
