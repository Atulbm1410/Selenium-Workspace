package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.id("email")).sendKeys("9876543210");
		Thread.sleep(6000);
		driver.findElement(By.id("pass")).sendKeys("Facebook@123");
		Thread.sleep(6000);
		driver.findElement(By.id("loginbutton")).click();

	}

}
