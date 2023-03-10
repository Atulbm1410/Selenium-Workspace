package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[aria-label=\"Phone number, username, or email\"]")).sendKeys("Instagram");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[aria-label=\"Password\"]")).sendKeys("abcd@123");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("div[class=\"_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm\"]")).click();
	}

}
