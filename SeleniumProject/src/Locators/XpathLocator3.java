package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Sign up']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9876543210123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Mark Zinjurke");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("@jinjurkeMark");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("MarkJinju143");
		Thread.sleep(3000);
		

	}

}
