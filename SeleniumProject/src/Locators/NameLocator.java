package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/OneDrive/Desktop/Selenium%20Workspace/HtmlScript/UserIdPassword.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Abcdefg");
		Thread.sleep(6000);
		driver.findElement(By.name("password")).sendKeys("Xyz@123");
		Thread.sleep(6000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.close();
		

	}

}
