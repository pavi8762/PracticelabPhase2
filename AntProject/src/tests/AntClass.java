package tests;

import java.util.Date;

import org.testng.annotations.Test;

public class AntClass {
	
	@Test
	public void Test1() {
		
		System.out.println("Hello Ant Program");
		System.out.println("Todays dateis ->" + currentDate());
		
	}
 public static String currentDate() {
	 
	 return new Date().toString();
 }
}
