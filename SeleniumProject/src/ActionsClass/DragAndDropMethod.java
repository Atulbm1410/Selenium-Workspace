package ActionsClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		
		// ScrollDown by 500 pixels :
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder']/ancestor::ol)[1]"));
		act.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("(//li[@id='fourth']/descendant::a)[1]"));
		Thread.sleep(2000);
		WebElement drop1 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		act.dragAndDrop(drag1, drop1).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/dragNDrop.jpg");
		Files.copy(src, dest);
		driver.navigate().refresh();
		
	}

}
