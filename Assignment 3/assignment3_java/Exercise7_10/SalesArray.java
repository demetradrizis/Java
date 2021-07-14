/* Demetra Drizis
   Assignment 3
   Exercise 7.10 */

public class SalesArray
{
   public static void main(String[] args)
	{
      int total, comission;
      int salesArray[] = {5000, 7000, 5500, 10500, 2000,
                          4000, 4500, 8000, 11000, 6000};

      System.out.println("Sales\tPay\n");

      for (int i = 0; i < salesArray.length; i++)
      {
         System.out.print("$" + salesArray[i] + "\t");

         comission = (salesArray[i] * 9) / 100;       // calculating comission
         total = 200 + comission;                     // adding comission to total

         System.out.println("$" + total);
		}
	}
}
