package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.ITestResult;

public class ExtentReport {
	
	ExtentReports extent;
	ExtentTest logger;
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	
	logger =extent.startTest("Test01");
	
	logger.log(LogStatus.PASS, "open facebook");
	
	extent.endTest(logger);
	extent.flush();
	extent.close();
	
}	
	
	
}