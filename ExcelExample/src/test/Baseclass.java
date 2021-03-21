package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.automationtesting.excelreport.Xl;


	public class Baseclass {
		
		public WebDriver driver;
		
		@BeforeMethod
		public void baseclass1() throws Exception
		{
			System.setProperty("webdriver.gecko.driver",  "/home/vachalapgmail/Downloads/geckodrvier");
		       driver = new FirefoxDriver();
		       driver.get("https://mvnrepository.com/");
		       Thread.sleep(2000);
		}
		
		@AfterMethod
		public void quitDriver() {
			driver.close();
		}
		
		
	}

