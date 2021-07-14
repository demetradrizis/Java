/* Demetra Drizis
 * Assignment 1
 * Exercise 2.17
 */
import java.util.Scanner;

public class Exercise217 
{

	public static void main(String[] args)
	{
		System.out.print("Enter 3 integers separated by spaces: ");
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();				//taking in 3 numbers 

		int num2 = input.nextInt();
		
		int num3 = input.nextInt();
		
		int sum = num1 + num2 + num3;			//sum of 3 numbers
		
		int average = sum/3; 					//average of 3 numbers
		
		int product = num1 * num2 * num3;		//product of 3 numbers
		
		int max = num1; 			
		
		if (num2 > max)
		{
			max = num2;							//finding max
		}
		if (num3 > max)
		{
			max = num3;
		}
		
		int min = num1;
		
		
		if (num2 < min)				//finding minimum
		{
			min = num2;
		}
		if (num3 < min)
		{
			min = num3;
		}
		
		
		System.out.printf("Sum is: %d%n", sum);
		
		System.out.printf("Average is: %d%n", average);
		
		System.out.printf("Product is: %d%n", product);				//printing out the numbers
		
		System.out.printf("Maximum is: %d%n", max);
		
		System.out.printf("Minimum is: %d%n", min);
		
	}

}
