package MethodDrivenPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Declaration for all the WebElement present on HomePage :
	@FindBy(xpath = "//a[text()= 'New']") private WebElement createNewTaskLink;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logOutLink;
	@FindBy(xpath = "//span[text()=\"Add Recent Task\"]") private WebElement addRecenttaskLink;
	
	
	
	
	//Initialization :
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization :
	
	public WebElement getCreateNewTaskLink() {
		return createNewTaskLink;
	}
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	public WebElement getAddRecenttaskLink() {
		return addRecenttaskLink;
	}
	
	public void logOutMethod() {
		
		logOutLink.click();
	}

}
