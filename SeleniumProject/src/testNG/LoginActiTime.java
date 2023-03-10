package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginActiTime {
	
  WebDriver driver;
  @Parameters({"browser", "Vusername", "Vpassword"})
  @Test
  public void loginToAtiTime(String browserValue, String username, String password) {
	  
	  if (browserValue.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("http://localhost:88/login.do");
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		
	} else if (browserValue.equalsIgnoreCase("firefox")) {
		
		 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("http://localhost:88/login.do");
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		
	} else {
		
		System.out.println("Invalid Browser..!!");
	}
  }
}
