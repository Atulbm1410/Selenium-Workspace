package MethodDrivenPOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {

	static WebDriver driver;
	public void setUp() throws IOException {
		
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		String url1 = flib.readPropertyData(PROP_PATH, "url1");
		if (browserValue.equalsIgnoreCase("chrome")) {
			
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url1);
			
		} else if (browserValue.equalsIgnoreCase("firefox")) {
			
			System.setProperty(GECKO_KEY, GECKO_PATH);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url1);
			
		} else {
			
			System.out.println("Invalid Browser");
		}
		
	}
	
	public void tearDown() {
		
		driver.quit();
	}

	

}
