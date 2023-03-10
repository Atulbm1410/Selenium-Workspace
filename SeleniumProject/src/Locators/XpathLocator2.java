package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Sign in securely']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First and last name']")).sendKeys("Atul");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9876543210");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='secondaryLoginClaim']")).sendKeys("atulm@gmail.com");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='At least 6 characters']")).sendKeys("abcdef@123");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();

	}

}
