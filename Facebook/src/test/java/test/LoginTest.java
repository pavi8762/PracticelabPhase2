package test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Baseclass{
	
	
	WebDriver driver;
	
	@Test
	public void Login() {
	
	LoginPage loginpage = new LoginPage(driver);
	loginpage.login();
	 
	//String ActTitle = driver.getTitle();
	
	
	}
	

}
