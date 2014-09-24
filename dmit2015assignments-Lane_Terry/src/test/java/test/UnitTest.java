package test;

import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {
	
	@Test
	public void testPowerOperator()
	{
		assertEquals(8, Math.pow(2, 3), 0);
	}
	
	@Test
	public void testDivision()
	{
		assertEquals(0.8, 4.0 / 5.0, 0);
	}
	
	@Test
	public void testStringCompare()
	{
		assertTrue("dmit2015" == "dmit2015");
		assertEquals("dmit2015", "dmit2015");
		assertTrue("dmit2015".equalsIgnoreCase("DMIT2015"));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testForException()
	{
		assertEquals(0, 3/0);
	}

	/*@Test(timeout=5000)
	public void testforInfiniteLoop()
	{
		while(true)
		{
			
		}
	}*/
	

}
