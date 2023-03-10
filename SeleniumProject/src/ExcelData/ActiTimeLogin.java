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

public class ActiTimeLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://localhost:88/login.do");
		Thread.sleep(3000);
		Flib flib = new Flib();
		
		String inValidUserName = flib.readExcelData("./data/testdata.xlsx", "validdata", 2, 0);
		String inValidPassword = flib.readExcelData("./data/testdata.xlsx", "validdata", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(inValidUserName);
		driver.findElement(By.name("pwd")).sendKeys(inValidPassword);
		driver.findElement(By.id("loginButton")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/ActiLogin.jpg");
		Files.copy(src, dest);

	}

}
