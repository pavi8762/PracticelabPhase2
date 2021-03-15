package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/vachalapgmail/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	

}
