package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[placeholder^='Email address']")).sendKeys("9876543210");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[placeholder^='Pass']")).sendKeys("abcdefg@123");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector(" button[id^='log']")).click();

	}

}
