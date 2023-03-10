package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3Assignment {
	 @Test(priority = 0)
	  public void f() {
		  
		  Reporter.log("f method", true);
	  }
	  
	  @Test
	  public void g() {
		  
		  Reporter.log("g method", true);
	  }
	  
	  @Test(priority = 6)
	  public void u() {
		  
		  Reporter.log("u method", true);
	  }
	  
	  @Test(priority = 0)
	  public void q() {
		  
		  Reporter.log("q method", true);
	  }
	  
	  @Test
	  public void k() {
		  
		  Reporter.log("k method", true);
	  }
	  
	  @Test(priority = 0)
	  public void y() {
		  
		  Reporter.log("y method", true);
	  }
	  
	  @Test(priority = 3)
	  public void a() {
		  
		  Reporter.log("a method", true);
	  }
}
