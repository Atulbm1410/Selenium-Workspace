package FindElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("iphone");
		Thread.sleep(3000);
		List<WebElement> suggestion  = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for (int i = 0 ; i<= suggestion.size(); i++) {
			
			WebElement iphones = suggestion.get(i);
			String iphoneList = iphones.getText();
			System.out.println(iphoneList);
			System.out.println(suggestion.size());
			
		}
		

	}

}
