package KeywordDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiValidLogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("http://localhost:88/login.do");
		Thread.sleep(3000);
		Flib1 flib1 = new Flib1();
		String validUser = flib1.readPropertyData1("./data/config.properties", "username1");
		driver.findElement(By.name("username")).sendKeys(validUser);
		String validpassword = flib1.readPropertyData1("./data/config.properties", "password1");
		driver.findElement(By.name("pwd")).sendKeys(validpassword);
		driver.findElement(By.id("loginButton")).click();

	}

}
