package ca.nait.dmit.domain;

import java.util.Calendar;

/**
 * This class is used to determine what the chinese zodiac is for a specific year. 
 * 
 * @author Lane Terry
 *   
 * @version 2014.09.19
 *
 */

public class ChineseZodiac 
{
	private int birthYear = Calendar.getInstance().get( Calendar.YEAR );

	public ChineseZodiac() 
	{
		super();
	}

	public ChineseZodiac(int birthYear) {
		super();
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * This method returns the zodiac based on the year property that is set in the 
	 * constructor or set method
	 * 
	 * @return one of the following: Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat, 
	 *								 Monkey, Rooster, Dog, Pig
	 */
	
	public String getAnimal()
	{
		String animal = "";
		int num = 0;
		
		num = (birthYear - 1900) % 12;
		
		switch(num)
		{
			case 0:
				animal = "Rat";
				break;
			case 1:
				animal = "Ox";
				break;
			case 2:
				animal = "Tiger";
				break;
			case 3:
				animal = "Rabbit";
				break;
			case 4:
				animal = "Dragon";
				break;
			case 5:
				animal = "Snake";
				break;
			case 6:
				animal = "Horse";
				break;
			case 7:
				animal = "Goat";
				break;
			case 8:
				animal = "Monkey";
				break;
			case 9:
				animal = "Rooster";
				break;
			case 10:
				animal = "Dog";
				break;
			case 11:
				animal = "Pig";
				break;
			default:
				animal = "You should not get this. Something went wrong.";
				break;
		}
		
		return animal;
	}
	
	
	
	
}
