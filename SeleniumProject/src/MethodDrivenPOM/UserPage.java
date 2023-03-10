package MethodDrivenPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	//Declaration :
	@FindBy(xpath = "//div[.='Users']") private WebElement userTab;
	@FindBy(xpath = "//span[.='User']") private WebElement newUserTab;
	
	
	
	//Initialization :
	
	public UserPage(WebElement driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization :
	public WebElement getUserTab() {
		return userTab;
	}
	
	public WebElement getNewUserTab() {
		return newUserTab;
	}
}
