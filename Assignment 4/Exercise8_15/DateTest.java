
public class DateTest
{
	public static void main(String [] args)
    {
      Date d1 = new Date(3, 4, 1997);
      Date d2 = new Date (10, 8, 1950);
      Date d3 = new Date (12, 25, 2020);
      System.out.printf("   %s\n", d1.slash());
      System.out.printf("   %s\n", d1.word_date());
      System.out.printf("   %s\n", d1.day_date());
      System.out.printf("   %s\n", d2.slash());
      System.out.printf("   %s\n", d2.word_date());
      System.out.printf("   %s\n", d2.day_date());
      System.out.printf("   %s\n", d3.slash());
      System.out.printf("   %s\n", d3.word_date());
      System.out.printf("   %s\n", d3.day_date());
      
      
    }
}
