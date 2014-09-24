package ca.nait.dmit.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMITest {

	  @Test
	  public void testGetBMIUnderweigth()
	  {
		BMI bmi = new BMI(110, 5 * 12 + 6);
		assertEquals(17.8, bmi.getBMI(), 0.05);
		assertTrue(bmi.getBMICategory().equalsIgnoreCase("underweight"));
	  }

	  @Test
	  public void testGetBMINormal()
	  {
		BMI bmi = new BMI(150, 5 * 12 + 6);
		assertEquals(24.2, bmi.getBMI(), 0.05);
		assertTrue(bmi.getBMICategory().equalsIgnoreCase("normal"));
	  }
	  
	  @Test
	  public void testGetBMIMe()
	  {
		BMI bmi = new BMI(140, 6 * 12 + 1);
		assertEquals(18.5, bmi.getBMI(), 0.05);
		assertTrue(bmi.getBMICategory().equalsIgnoreCase("underweight"));
	  }

	  @Test
	  public void testGetBMIOverweight()
	  {
		BMI bmi = new BMI(165, 5 * 12 + 6);
		assertEquals(26.6, bmi.getBMI(), 0.05);
		assertTrue(bmi.getBMICategory().equalsIgnoreCase("overweight"));
	  }

	  @Test
	  public void testGetBMIObese()
	  {
		BMI bmi = new BMI(190, 5 * 12 + 6);
		assertEquals(30.7, bmi.getBMI(), 0.05);
		assertTrue(bmi.getBMICategory().equalsIgnoreCase("obese"));
	  }

}
