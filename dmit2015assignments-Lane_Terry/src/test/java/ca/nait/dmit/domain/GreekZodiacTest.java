package ca.nait.dmit.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreekZodiacTest {

	@Test
	public void testThisDay()
	{
		//Date tested was September 16
		GreekZodiac gz = new GreekZodiac(16, 9 - 1);
		assertEquals("Virgo", gz.getConstellation());
	}
	
	@Test
	public void testBirthYear()
	{
		GreekZodiac gz = new GreekZodiac(13, 2 - 1);
		assertEquals("Aquarius", gz.getConstellation());
	}
	
	@Test
	public void testFriendYear()
	{
		GreekZodiac gz = new GreekZodiac(9, 5 - 1);
		assertEquals("Taurus", gz.getConstellation());
	}
	
	@Test
	public void testAries()
	{
		GreekZodiac gz = new GreekZodiac(21, 3 - 1);
		assertEquals("Aries", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(20, 4 - 1);
		assertEquals("Aries", gz2.getConstellation());
	}
	
	@Test
	public void testTaurus()
	{
		GreekZodiac gz = new GreekZodiac(21, 4 - 1);
		assertEquals("Taurus", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(20, 5 - 1);
		assertEquals("Taurus", gz2.getConstellation());
	}
	
	@Test
	public void testGemini()
	{
		GreekZodiac gz = new GreekZodiac(21, 5 - 1);
		assertEquals("Gemini", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(21, 6 - 1);
		assertEquals("Gemini", gz2.getConstellation());
	}
	
	@Test
	public void testCancer()
	{
		GreekZodiac gz = new GreekZodiac(22, 6 - 1);
		assertEquals("Cancer", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(22, 7 - 1);
		assertEquals("Cancer", gz2.getConstellation());
	}
	
	@Test
	public void testLeo()
	{
		GreekZodiac gz = new GreekZodiac(23, 7 - 1);
		assertEquals("Leo", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(22, 8 - 1);
		assertEquals("Leo", gz2.getConstellation());
	}
	
	@Test
	public void testVirgo()
	{
		GreekZodiac gz = new GreekZodiac(23, 8 - 1);
		assertEquals("Virgo", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(22, 9 - 1);
		assertEquals("Virgo", gz2.getConstellation());
	}
	
	@Test
	public void testLibra()
	{
		GreekZodiac gz = new GreekZodiac(23, 9 - 1);
		assertEquals("Libra", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(22, 10 - 1);
		assertEquals("Libra", gz2.getConstellation());
	}
	
	@Test
	public void testScorpio()
	{
		GreekZodiac gz = new GreekZodiac(23, 10 - 1);
		assertEquals("Scorpio", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(21, 11 - 1);
		assertEquals("Scorpio", gz2.getConstellation());
	}
	
	@Test
	public void testSagittarius()
	{
		GreekZodiac gz = new GreekZodiac(22, 11 - 1);
		assertEquals("Sagittarius", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(21, 12 - 1);
		assertEquals("Sagittarius", gz2.getConstellation());
	}
	
	@Test
	public void testCapricorn()
	{
		GreekZodiac gz = new GreekZodiac(22, 12 - 1);
		assertEquals("Capricorn", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(19, 1 - 1);
		assertEquals("Capricorn", gz2.getConstellation());
	}
	
	@Test
	public void testAquarius()
	{
		GreekZodiac gz = new GreekZodiac(20, 1 - 1);
		assertEquals("Aquarius", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(18, 2 - 1);
		assertEquals("Aquarius", gz2.getConstellation());
	}
	
	@Test
	public void testPisces()
	{
		GreekZodiac gz = new GreekZodiac(19, 2 - 1);
		assertEquals("Pisces", gz.getConstellation());
		GreekZodiac gz2 = new GreekZodiac(20, 3 - 1);
		assertEquals("Pisces", gz2.getConstellation());
	}

}
