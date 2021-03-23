package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testcase1 {

	WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 
		 EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver);
		 
		 ListenerClass listenerclass = new ListenerClass();
		 
		 
		 
		 
		 
		 eventRecorder.register(listenerclass);
		 eventRecorder.navigate().to("https://www.google.com");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 

	}
}
