/* Demetra Drizis
 * Assignment 4
 * Exercise 8.5
 */

public class Time2
 {
   private int secondsAfterMidnight;  // 0 - (24 * 60 * 60 -1)

   // Time2 constructor initializes each instance variable to zero;
   public Time2()
   {
      this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int hour)
   {
      this(hour, 0, 0 ); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2(int hour, int minute)
   {
      this(hour, minute, 0); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour, minute and second supplied
   public Time2(int hour, int minute, int second)
   {
      setTime(hour, minute, second); // invoke setTime to validate time
   }

   // Time2 constructor: another Time2 object supplied
   public Time2(Time2 time)
   {
      this(time.getHour(), time.getMinute(), time.getSecond()); 
   }
// set a new time value using universal time; 
   // validity checks on data; set invalid values to zero
   public void setTime( int hour, int minute, int second)
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
   {
                return secondsAfterMidnight / 3600;
   }
   public int getMinute ()
   {
                return secondsAfterMidnight % 3600 / 60;
   }
   public int getSecond ()
   {
                return secondsAfterMidnight % 60;
   }

   public String toUniversalString()
   {
       return String.format(
       "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   public String toString()
   {
      return String.format("%d:%02d:%02d %s", ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
      getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   }
 }
