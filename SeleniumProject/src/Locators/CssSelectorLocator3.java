package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromme.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/log/s?k=log+in");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[id$='-1-announce']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[id$='_email']")).sendKeys("9876543210");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[aria-labelledby$='announce']")).click();

	}

}
