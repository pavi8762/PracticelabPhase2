package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddIntegerNumbers {
	
	@Test
	
	public void additiontest() {
	
	Calculator calc = new Calculator();
			
	int a= 10;
	int b = 20;
	
	int act = calc.addnumber(a, b);
	int exp = 30;
	
	Assert.assertEquals(act,exp);
			
	}

}
