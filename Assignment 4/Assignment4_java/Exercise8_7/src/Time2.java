/* Demetra Drizis
 * Assignment 4
 * Exercise 8.7
 */
public class Time2
 {
   private int secondsAfterMidnight;  // 0 - (24 * 60 * 60 -1)

   // Time2 constructor initializes each instance variable to zero;
   public Time2()
   {  this( 0, 0, 0 ); }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
   public Time2(int hour)
   {  this(hour, 0, 0 ); }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
   public Time2(int hour, int minute)
   {  this(hour, minute, 0); }

   // Time2 constructor: hour, minute and second supplied
   public Time2(int hour, int minute, int second)
   {  setTime(hour, minute, second); }

   // Time2 constructor: another Time2 object supplied
   public Time2(Time2 time)
   {  this(time.getHour(), time.getMinute(), time.getSecond()); }

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
   {  secondsAfterMidnight += 3600; }

   public String toUniversalString()
   {
       return String.format(
       "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   public String toString()
   {
      return String.format("%d:%02d:%02d %s",
      ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
      getMinute(), getSecond(), ( getHour() >= 12 ? "AM" : "PM" ) );
   }

   public static void main(String[] args)
   {
      System.out.println("Creating new time Object");
      Time2 t1 = new Time2(10, 00, 59);
      System.out.printf("  %s\n", t1.toString());
      System.out.println("Testing tick method...");
      t1.tick();
      System.out.printf("  %s\n", t1.toString());

      System.out.println("Creating new time Object");
      Time2 t2 = new Time2(10, 59, 00);
      System.out.printf("  %s\n", t2.toString());
      System.out.println("Testing incrementMinute method...");
      t2.incrementMinute();
      System.out.printf("  %s\n", t2.toString());

      System.out.println("Creating new time Object");
      Time2 t3 = new Time2(11, 59, 59);
      System.out.printf("  %s\n", t3.toString());
      System.out.println("Testing incrementHour method...");
      t3.incrementHour();
      System.out.printf("  %s\n", t3.toString());
   }
}