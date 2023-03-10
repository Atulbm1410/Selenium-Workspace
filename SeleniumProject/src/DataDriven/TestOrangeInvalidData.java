package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrangeInvalidData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Flib flib = new Flib();
		 int rc  = flib.getRowCountMethod("./data/testOrangehrmdata.xlsx", "invaliddata");
		 
		 for (int i = 1; i < rc; i++) {
			 
			 String invalidUsername = flib.readExcelData("./data/testOrangehrmdata.xlsx", "invaliddata", i, 1);
			 driver.findElement(By.name("username")).sendKeys(invalidUsername);
			 Thread.sleep(3000);
			 String invalidPassword = flib.readExcelData("./data/testOrangehrmdata.xlsx", "invaliddata", i, 1);
			 driver.findElement(By.name("password")).sendKeys(invalidPassword);
			 
			 driver.findElement(By.xpath("//button[@type= 'submit']")).click();
			 Thread.sleep(3000);
			 
			 driver.findElement(By.name("username")).clear();
			
		}

	}

}
