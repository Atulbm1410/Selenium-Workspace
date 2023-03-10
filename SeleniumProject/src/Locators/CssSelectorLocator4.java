package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name*='erna']")).sendKeys("Admin");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[name*='sswo']")).sendKeys("admin123");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("button[type*='bm']")).click();

	}

}
