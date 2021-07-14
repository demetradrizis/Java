/*Demetra Drizis
 * Assignment 2
 * Exercise 6.9
 */

import java.lang.Math;				//importing to use for rounding
import java.util.Scanner;			//user input

public class Exercise6_9 
{

	public static void main(String[] args) 
	{
		double x; 
		Scanner input = new Scanner (System.in);		
		
		System.out.println("Enter a number: ");
		x = input.nextDouble();					//taking in a double
		
		System.out.printf("Original number: " + x + "\n");	//printing double
		System.out.printf("Rounded Number: " + (Math.round(x)));	//printing number rounded
																	//with round function
		
	
	}

}
