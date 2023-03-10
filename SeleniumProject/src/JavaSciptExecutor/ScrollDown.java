package JavaSciptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);
		
		//ScollDown by 500 pixels :
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//ScrollUp by 500 pixels :
		
		jse.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(3000);
		
		//ScrollRight by 500 pixels :
		jse.executeScript("window.scrollBy(500,0)");
		Thread.sleep(3000);
		
		//ScrollLeft by 500 pixels :
		jse.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(3000);

	}

}
