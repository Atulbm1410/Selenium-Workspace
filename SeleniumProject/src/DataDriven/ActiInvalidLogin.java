package DataDriven;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiInvalidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("http://localhost:88/login.do");
		Thread.sleep(3000);
		Flib1 flib1 = new Flib1();
		int rc1= flib1.getRowCount1("./data/testdata.xlsx", "invaliddata");
		
		for (int i = 1; i < rc1; i++) {
			
			String invalidUser = flib1.readExcelData1("./data/testdata.xlsx", "invaliddata", i, 1);
			driver.findElement(By.name("username")).sendKeys(invalidUser);
			String invalidPassword = flib1.readExcelData1("./data/testdata.xlsx", "invaliddata", i, 1);
			driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
		}
		

	}

}
