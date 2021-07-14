/* Demetra Drizis
 * Assignment 4
 * Exercise 8.8
 */
public class Date
  {

      private int month;  //1-12
      private int day;	  //1-31 based on month
      private int year;   // any year between 1900 - 2100

      private static final int[] daysPerMonth =
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      public Date(int month, int day, int year)		//constructor
      {
           if (month <= 0 || month > 12)	//check if month in range
           {
               throw new IllegalArgumentException("month (" + month + ") must be 1-12");
           }

           if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))	//check if day in range for month
           {
              throw new IllegalArgumentException ("day (" + day + ") out-of-range for the specified month and year");
           }

           if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))		//check for leap year
           {
              throw new IllegalArgumentException ("day (" + day + ") out-of-range for the specified month and year");
           }
           if (year < 1900 ||  year > 2100)		//check if year in range
           {
              throw new IllegalArgumentException(year + " Invalid year (%d) set to 1950."); // validate
           }

           this.month = month;
           this.day = day;
           this.year = year;

           System.out.printf("Date object constructor for date %s%n", this);

      }
      public void nextDay()	//incrementing the day based on the month
      {
           if (day == 28 && month == 2 && year % 400 == 0)
           {
               day = day + 1;
           }
           else if (day >= daysPerMonth[month])
           {
                nextMonth();
           }
           else
                day = day + 1;
      }

      public void nextMonth()
      {
           if (month == 12)		//incrementing the month
           {
              nextYear();
           }
           else
           {
              month = month + 1;;
              day = 1;
           }
       }

      public void nextYear()	//incrementing the year
      {
           year = year + 1;
           month = 1;
           day = 1;
      }
      public String toString()		//return a string in the form of month/day/year
      {
         return String.format("%d/%d/%d", month, day, year);
      }


  }
