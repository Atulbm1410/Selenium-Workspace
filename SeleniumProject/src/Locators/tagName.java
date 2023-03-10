package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/Selenium%20Workspace/HtmlScript/UserIdPassword.html");
		driver.findElement(By.tagName("input")).sendKeys("asdfg");
		driver.findElement(By.name("password")).sendKeys("adssff131");
		driver.findElement(By.tagName("button")).click();
		
	}

}