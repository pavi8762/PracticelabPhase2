package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement Uname;
	
	@FindBy(id ="pass")
	WebElement Pwd;
	
	@FindBy(id="u_0_b")
	WebElement Button;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		
		Uname.sendKeys("Test123");
		Pwd.sendKeys("1234");
		Button.click();
	}
}
