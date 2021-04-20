package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority=0)
	public void Testcase2()
	{
		System.out.println("This is Test2");
	}
	@AfterTest
	public void at() {
		System.out.println("This will Execute After Test");
	}

}
