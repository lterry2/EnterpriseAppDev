package ca.nait.dmit.domain;

import java.util.Calendar;

/**
 * This class is used to determine what the greek zodiac is for a specific day of the month 
 * 
 * @author Lane Terry
 *   
 * @version 2014.09.19
 *
 */

public class GreekZodiac 
{
	private int birthDay = Calendar.getInstance().get( Calendar.DAY_OF_MONTH );
	private int birthMonth =  Calendar.getInstance().get( Calendar.MONTH );
	
	public GreekZodiac() {
		super();
	}

	public GreekZodiac(int birthDay, int birthMonth) {
		super();
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	/**
	 * This method returns the zodiac based on the day and month properties that are set 
	 * in the constructor or set method
	 * 
	 * @return one of the following: Aries, Tarus, Gemini, Cancer, Leo, Virgo, Libra, 
	 *								 Scorpio, Sagittarius, Capricorn, Aquarius, Pisces
	 */
	
	public String getConstellation()
	{
		int BirthMonth = birthMonth;
		int BirthDay = birthDay;
		
		String constellation = "";
		
		switch(BirthMonth)
		{
			case 0:
				if(BirthDay <= 19)
				{
					constellation = "Capricorn";
				}
				else
				{
					constellation = "Aquarius";
				}
				break;
			case 1:
				if(BirthDay <= 18)
				{
					constellation = "Aquarius";
				}
				else
				{
					constellation = "Pisces";
				}
				break;
			case 2:
				if(BirthDay <= 20)
				{
					constellation = "Pisces";
				}
				else
				{
					constellation = "Aries";
				}
				break;
			case 3:
				if(BirthDay <= 20)
				{
					constellation = "Aries";
				}
				else
				{
					constellation = "Taurus";
				}
				break;
			case 4:
				if(BirthDay <= 20)
				{
					constellation = "Taurus";
				}
				else
				{
					constellation = "Gemini";
				}
				break;
			case 5:
				if(BirthDay <= 21)
				{
					constellation = "Gemini";
				}
				else
				{
					constellation = "Cancer";
				}
				break;
			case 6:
				if(BirthDay <= 22)
				{
					constellation = "Cancer";
				}
				else
				{
					constellation = "Leo";
				}
				break;
			case 7:
				if(BirthDay <= 22)
				{
					constellation = "Leo";
				}
				else
				{
					constellation = "Virgo";
				}
				break;
			case 8:
				if(BirthDay <= 22)
				{
					constellation = "Virgo";
				}
				else
				{
					constellation = "Libra";
				}
				break;
			case 9:
				if(BirthDay <= 22)
				{
					constellation = "Libra";
				}
				else
				{
					constellation = "Scorpio";
				}
				break;
			case 10:
				if(BirthDay <= 21)
				{
					constellation = "Scorpio";
				}
				else
				{
					constellation = "Sagittarius";
				}
				break;
			case 11:
				if(BirthDay <= 21)
				{
					constellation = "Sagittarius";
				}
				else
				{
					constellation = "Capricorn";
				}
				break;
			default:
				constellation = "You were born in no month... that can not be right.";
				break;
		}
		
		return constellation;
	}
}
