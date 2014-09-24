package ca.nait.dmit.domain;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class ChineseZodiacTest {

	@Test
	public void testBaseYear()
	{
		ChineseZodiac cz = new ChineseZodiac(1900);
		assertEquals("Rat", cz.getAnimal());
	}
	
	@Test
	public void testMidCycleYear()
	{
		ChineseZodiac cz = new ChineseZodiac(1942);
		assertEquals("Horse", cz.getAnimal());
	}
	
	@Test
	public void testThisYear()
	{
		ChineseZodiac cz = new ChineseZodiac();
		assertEquals("Horse", cz.getAnimal());
	}
	
	@Test
	public void testBirthYear()
	{
		ChineseZodiac cz = new ChineseZodiac(1996);
		assertEquals("Rat", cz.getAnimal());
	}
	
	@Test
	public void testFriendYear()
	{
		ChineseZodiac cz = new ChineseZodiac(1992);
		assertEquals("Monkey", cz.getAnimal());
	}
	
	public static final int CURRENT_YEAR = Calendar.getInstance().get( Calendar.YEAR );
	
	 @Test
	  public void testCurrentYear()
	  {
		ChineseZodiac chineseZodiacBean = new ChineseZodiac(2012);
		assertEquals("Dragon", chineseZodiacBean.getAnimal());
	  }

	  @Test
	  public void testGetAnimalRat()
	  {
		int animalYear = 1900;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rat", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalOx()
	  {
		int animalYear = 1901;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Ox", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalTiger()
	  {
		int animalYear = 1902;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Tiger", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalRabbit()
	  {
		int animalYear = 1903;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rabbit", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalDragon()
	  {
		int animalYear = 1904;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Dragon", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalSnake()
	  {
		int animalYear = 1905;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Snake", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalHorse()
	  {
		int animalYear = 1906;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Horse", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalGoat()
	  {
		int animalYear = 1907;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Goat", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalMonkey()
	  {
		int animalYear = 1908;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Monkey", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalRooster()
	  {
		int animalYear = 1909;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rooster", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalDog()
	  {
		int animalYear = 1910;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Dog", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalPig()
	  {
		int animalYear = 1911;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Pig", chineseZodiacBean.getAnimal());
		  animalYear += 12;
		}
	  }

}
