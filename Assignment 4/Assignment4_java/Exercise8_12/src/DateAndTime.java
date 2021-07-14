/* Demetra Drizis
 * Assignment 4
 * Exercise 8.12
 */
public class DateAndTime
{
   private int month;  //1-12
   private int day;	  //1-31 based on month
   private int year;   //any year between 1900 - 2100

   private static final int[] daysPerMonth =
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   private int secondsAfterMidnight;  // 0 - (24 * 60 * 60 -1)

   // Constructor for Date & Time Object
   public DateAndTime(int hour, int minute, int second, int month, int day, int year)
   {
      if (month <= 0 || month > 12)	//check if month in range
         throw new IllegalArgumentException("month (" + month + ") must be 1-12");

      if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) //check if day in range for month
         throw new IllegalArgumentException ("day (" + day + ") out-of-range for the specified month and year");

      if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))  //check for leap year
         throw new IllegalArgumentException ("day (" + day + ") out-of-range for the specified month and year");

      if (year < 1900 ||  year > 2100)		//check if year in range
         throw new IllegalArgumentException(year + " Invalid year (%d) set to 1950."); // validate

      this.month = month;
      this.day = day;
      this.year = year;

      setTime(hour, minute, second);
   }

   public void setTime(int hour, int minute, int second)
   {
      if (((hour >= 0) && (hour < 24 )))
         secondsAfterMidnight = hour * 60 * 60;
      else
         secondsAfterMidnight = 0;

      if (((minute >= 0) && (minute < 60 )))
         secondsAfterMidnight = secondsAfterMidnight + minute * 60;

      if (((second >= 0) && (second < 60 )))
         secondsAfterMidnight = secondsAfterMidnight +  second;
   }

   public int getHour ()
   {  return secondsAfterMidnight / 3600; }

   public int getMinute ()
   {  return secondsAfterMidnight % 3600 / 60;  }

   public int getSecond ()
   {  return secondsAfterMidnight % 60;   }

   public void tick ()
   {  secondsAfterMidnight++; }

   public void incrementMinute ()
   {  secondsAfterMidnight += 60;   }

   public void incrementHour ()
   {
      secondsAfterMidnight += 3600;

      if ((secondsAfterMidnight / 3600) >= 12)
        nextDay();
   }

   public void nextDay()	//incrementing the day based on the month
   {
      if (day == 28 && month == 2 && year % 400 == 0)
         day += 1;

      else if (day >= daysPerMonth[month])
         nextMonth();

      else
         day += 1;
   }

   public void nextMonth()
   {
      if (month == 12)		//incrementing the month
         nextYear();

      else
      {
         month += 1;;
         day = 1;
      }
   }

   public void nextYear()	//incrementing the year
   {
      year += 1;
      month = 1;
      day = 1;
   }

   public String toUniversalString()
   {
       return String.format(
       "%d/%d/%d~%02d:%02d:%02d", month, day, year, getHour(), getMinute(), getSecond());
   }

   public String toString()
   {
      return String.format("%d/%d/%d~%d:%02d:%02d %s", month, day, year, ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
      getMinute(), getSecond(), ( getHour() >= 12 ? "AM" : "PM" ) );
   }

   public static void main(String[] args)
   {
      System.out.println("Creating new  Date & Time Object");
      DateAndTime t = new DateAndTime(11, 00, 00, 11, 15, 1996);
      System.out.printf("  %s\n", t.toString());
      System.out.printf("  %s\n", t.toUniversalString());

      System.out.println("Testing increment time to next day...");
      t.incrementHour();
      System.out.printf("  %s\n", t.toString());
      System.out.printf("  %s\n", t.toUniversalString());
   }
}
