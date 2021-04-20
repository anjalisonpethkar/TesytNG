package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeTest
	public void bt()
	{
		System.out.println("This will Execute Before Test");
		//Assert.assertEquals("Anjali","Sam");
		
	}
	@Test
	public void Testcase1()
	{
		System.out.println("This is Test1");
	}

}
