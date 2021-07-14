/* Demetra Drizis
 * Assignment 4
 * Exercise 8.15
 */
public class Date
{
	private int month ; //1-12
    private int day ; //1-31
    private int year ; // 1980+
    private String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September",
    "October", "November", "December"};
    private int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date()
    {
    	
}
    		public Date(int m, int d, int y)
    	    {
    	        setMonth(m);			//constructor for slash form
    	        setDay(d);
    	        setYear(y);
    	    }

    	    public Date(String m, int d, int y)		//constructor for word form
    	    {
    	        setMonth(month_name(m));
    	        setDay(d);
    	        setYear(y);
    	    }

    	    public Date(int ddd, int y)
    	    {
    	    	day_of_year();
    	       // identifyDayMonth(ddd);			//constructor for day and year form 
    	        setYear(y);
    	    }

    	    public int getMonth()
    	    {
    	        return month;
    	    }
    	    public void setMonth(int m)
    	    {
    	    	if (m > 0 && m < 13)				//error checking the month if it is not in range set to 1
    	    		month = m;
    	    	else 
    	    		month = 1;

    	    }

    	    public int getDay()
    	    {
    	        return day;
    	    }

    	    public void setDay(int d)
    	    {

    	        if (d > 0 && d <= monthDays[month])
    	        {
    	            day = d;
    	        }
    	        else if (month == 2 && d == 29 && isLeapYear())		//checking the day to make sure its in range for that month
    	        {
    	            day = d;
    	        }
    	        else
    	        {
    	            day = 1;
    	        }
    	    }

    	    public int getYear()
    	    {
    	        return year;
    	    }

    	    public void setYear(int y)
    	    {
    	    	if (y > 1900 || y < 2100)			//years between 1900 and 2100
    	    		year = y;
    	    	else 
    	    		year = 2018;
    	    }

    	    public boolean isLeapYear()
    	    {
    	        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
    	        {
    	            return true;
    	        }
    	        else						//checking for leap year
    	        {
    	            return false;
    	        }
    	    }

    	 

    	    public int day_of_year()
    	    {
    	        int d = 0;
    	        for (int i = 1; i < month; i++)
    	        {
    	            if (isLeapYear() && i == 2)
    	            {
    	                d = d + 29;		//checking what day it is number wise
    	            }
    	            else
    	            {
    	                d = d + monthDays[i];
    	            }
    	        }
    	        d = d + day;
    	        return d;
    	    }

    	    public String convert_month()
    	    {
    	        return monthNames[month];
    	    }

    	    public int month_name(String theMonth)
    	    {

    	        for (int i = 1; i < monthNames.length; i++)
    	        {
    	            if (monthNames[i].equalsIgnoreCase(theMonth))		//returning the month in a word form
    	            {
    	                return i;
    	            }
    	        }
    	        return 1;
    	    }
 
    	    
    	    public String slash()		//printing in slash form
    	    {
    	        return month + "/" + day + "/" + year;			
    	    }

    	    public String word_date()		//printing in word form
    	    {
    	        return convert_month() + " " + day + ", " + year;
    	    }
    	    public String day_date()		//printing in day form 
    	    {
    	        return day_of_year() + " " + year;
    	    }
  }

    
