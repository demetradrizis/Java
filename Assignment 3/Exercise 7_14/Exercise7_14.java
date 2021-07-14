/* 
 Demetra Drizis
 Assignment 3
 Exercise 7.14
 */
import java.util.Scanner;

public class Exercise7_14
{
	public static int Product(int ...numbers)
	{
		int product = 1; 
		for (int p : numbers)
		{
			product = product * p; 
		}
		return product; 
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
	
		int p1 = 10; 
		int p2 = 30;
		int p3 = 20;
		int p4 = 5;
		int p5 = 6;
		int p6 = 7;
		
		System.out.printf("Product = ");
		System.out.println(Product(p1, p2, p3, p4, p5, p6));
        System.out.println(Product(p1, p2, p3)); 
	

	}

}
