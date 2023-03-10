package Rtp;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RemotePollymorphism {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		Scanner cn = new Scanner(System.in);
		System.out.println("Enter the browser name :");
		String browserValue = cn.nextLine();
		System.out.println(browserValue);
		
		if (browserValue.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			Alert al = driver.switchTo().alert();
			al.dismiss();
			
		} else if (browserValue.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			Alert al = driver.switchTo().alert();
			al.accept();
			
		} else {
			
			System.out.println("Invalid Browser..!");
		}

	}

}
