package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag8 {
	 @Test(groups = "FUNCTIONAL")
	  public void ft1() {
		 
		 Reporter.log("Functional Test case 1 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it1() {
		  
		  Reporter.log("Integration Test case 1 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st1() {
		  
		  Reporter.log("Smoke Test case 1 excuted", true);
	  }
	  
	  //----------------------------------------------------------------------------------------------------------------------------
	  
	  @Test(groups = "FUNCTIONAL")
	  public void ft2() {
		 
		 Reporter.log("Functional Test case 2 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it2() {
		  
		  Reporter.log("Integration Test case 2 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st2() {
		  
		  Reporter.log("Smoke Test case 2 excuted", true);
	  }
	  
	  //-------------------------------------------------------------------------------------------------------------------------
	  
	  @Test(groups = "FUNCTIONAL")
	  public void ft3() {
		 
		 Reporter.log("Functional Test case 3 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it3() {
		  
		  Reporter.log("Integration Test case 3 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st3() {
		  
		  Reporter.log("Smoke Test case 3 excuted", true);
	  }
	  
	  //----------------------------------------------------------------------------------------------------------------------------
	  
	  @Test(groups = "FUNCTIONAL")
	  public void ft4() {
		 
		 Reporter.log("Functional Test case 4 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it4() {
		  
		  Reporter.log("Integration Test case 4 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st4() {
		  
		  Reporter.log("Smoke Test case 4 excuted", true);
	  }
	  
	  //----------------------------------------------------------------------------------------------------------------------------
	  
	  @Test(groups = "FUNCTIONAL")
	  public void ft5() {
		 
		 Reporter.log("Functional Test case 5 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it5() {
		  
		  Reporter.log("Integration Test case 5 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st5() {
		  
		  Reporter.log("Smoke Test case 5 excuted", true);
	  }
	  
	  //---------------------------------------------------------------------------------------------------------------------------------
	  
	  @Test(groups = "FUNCTIONAL")
	  public void ft6() {
		 
		 Reporter.log("Functional test case 6 executed", true);
	  }
	  
	  @Test(groups = "INTEGRATION")
	  public void it6() {
		  
		  Reporter.log("Integration test case 6 executed", true);
	  }
	  
	  @Test(groups = "SMOKE")
	  public void st6() {
		  
		  Reporter.log("Smoke Test case 6 excuted", true);
	  }
}
