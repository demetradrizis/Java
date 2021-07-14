public class Date2Test
{
     public static void main (String[] args)
     {
        Date d1 = new Date(3, 4, 1997);
        System.out.printf("   %s\n", d1.toString());
        Date d2 = new Date(3, 4, 1901);
        System.out.printf("   %s\n", d2.toString());
        
        
        
        for(int i = 0; i < 365; i++)
        {
        	d1.nextDay();
        	System.out.printf("   %s\n", d1.toString());
        }

     }


}