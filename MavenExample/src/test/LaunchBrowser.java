package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	WebDriver driver;
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		
	}

}
