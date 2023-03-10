package ExcelData;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OrangeHrmLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 
		 Flib flib = new Flib();
		 String inValidUser= flib.readExcelData("./data/testOrangehrmdata.xlsx", "Orangedata", 4, 0);
		 String inValidPassword= flib.readExcelData("./data/testOrangehrmdata.xlsx", "Orangedata", 4, 1);
		 
		 driver.findElement(By.name("username")).sendKeys(inValidUser);
		 driver.findElement(By.name("password")).sendKeys(inValidPassword);
		 driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		 
		 Thread.sleep(3000);
		 
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/OrangeLogin.jpg");
		 Files.copy(src, dest);

	}

}
