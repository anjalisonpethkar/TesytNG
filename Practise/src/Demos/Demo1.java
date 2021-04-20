package Demos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Demo1 {
	
	@Before
	public void bt()
	{
		Assert.assertEquals("Anjali","Sam");
	System.out.println("This will Execute Before Test");
	}

	@Test
	public void testcase1()
	{
		System.out.println("This will Execute while Test");
	}
	@After
	public void at()
	{
		System.out.println("This will Execute After Test");
	}
}