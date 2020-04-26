//ARSHIA KOHANTEB - AP COMP SCI - AP CALANDER 

public class APCalender
{

public static int numberOfLeapYears(int year1, int year2)
{  
	int leapyears = 0;
	
	for(int i = year1; i < year2; i++) 
	{
		if(isleapyear(i)) 
		{
			leapyears++;
		}
	}
	return leapyears;
}
 

public static int dayOfWeek(int month, int day, int year)
	{  
	
	int dayOfTheWeek = firstDayOfYear(year);
	  int additionalDays = dayOfYear(month, day, year) - 1;

	  for(int d = 1; d <= additionalDays; d++)
	  {
	    dayOfTheWeek++;

	    if(dayOfTheWeek == 7) 
	    {
	      dayOfTheWeek = 0;
	    }
	  }
	        
	  return dayOfTheWeek;
	}
 
 
}
