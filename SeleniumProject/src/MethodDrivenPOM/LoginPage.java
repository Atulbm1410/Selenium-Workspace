package MethodDrivenPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declare all the Element Present on Login page :
	@FindBy(name = "username") private WebElement usn;
	@FindBy(name = "pwd") private WebElement pass;
	@FindBy(id = "loginButton") private WebElement loginBtn;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath = "//a[text()='View License']") private WebElement licenseLink;
	
	
	//initialization :
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	//Utilization :
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLicenseLink() {
		return licenseLink;
	}
	
	public void validLoginToActiTime(String validUserName, String validPassword) throws InterruptedException {
		
		usn.sendKeys(validUserName);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
		
	}
	
	public void invalidLoginToActiTime(String validUserName, String validPassword) throws InterruptedException {
		
		usn.sendKeys(validUserName);
		pass.sendKeys(validPassword);
		loginBtn.click();
		Thread.sleep(3000);
		usn.clear();
		
		
	}

}
