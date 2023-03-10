package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		
		String validUserName = flib.readExcelData("./data/testOrangehrmdata.xlsx", "Orangedata", 4, 0);
		driver.findElement(By.name("username")).sendKeys(validUserName);
		
		String validPassword = flib.readExcelData("./data/testOrangehrmdata.xlsx", "Orangedata", 4, 1);
		driver.findElement(By.name("password")).sendKeys(validPassword);
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();

	}

}
