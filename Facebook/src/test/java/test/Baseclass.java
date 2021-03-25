package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class Baseclass {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

}
