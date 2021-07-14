/* Demetra Drizis
 * Assignment 2
 * Exercise 6.29
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class Coin_Toss 
{
	private static final SecureRandom randomNumbers = new SecureRandom();	//secure random number generator
	private enum Status {HEADS, TAILS};		//represent status of heads or tails
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int heads = 0; 
		int tails = 0; 
		int choice; 
		boolean face;
		
		Status gameStatus;		//heads or tails
		
		
		flip object = new flip(); 
		
	do
	{
			System.out.println("Do you want to: \n 1. Toss Coin\n 2. Show Results\n 3. Exit\n");
			System.out.println("Choice: ");
			choice = input.nextInt(); 
			
	
		
		if (choice == 1)
		{
			face = object.flip();
			
			if (face == true)
			{
				heads++; 
				gameStatus = Status.HEADS;		//if heads, adds to heads results
			}
			else if (face == false)
			{
				tails++;
				gameStatus = Status.TAILS;		//if tails adds to tails results
			}
			
			//System.out.println ("You flipped a : " + face + "\n");
		}
		else if (choice == 2)
		{
			System.out.println ("Heads: " + heads);
			System.out.println ("Tails: " + tails + "\n"); 		//prints results of flips
		}
		
	}while (choice !=3);		//exits if user picks 3
	
	}
}

