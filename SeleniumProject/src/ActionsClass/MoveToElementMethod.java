package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		act.moveToElement(element).perform();
		Thread.sleep(1000);
		
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Your Account']"));
		act.moveToElement(element1).perform();
		Thread.sleep(1000);
		
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		act.moveToElement(element2).perform();
		Thread.sleep(1000);
		
		WebElement element3 = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		act.moveToElement(element3).perform();
		Thread.sleep(1000);
		
		WebElement element4 = driver.findElement(By.xpath("//span[text()='Your Recommendations']"));
		act.moveToElement(element4).click().perform();
		
		
		

	}

}
