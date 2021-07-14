/* Demetra Drizis
 * Assignment 2
 * Exercise 6.29
 */

import java.util.Random; 

public class flip 
{
	boolean flip ()
	{
		int coin; 
		
		Random randomNumbers = new Random(); //random number generator
		
		coin = 1 + randomNumbers.nextInt(2); 
		
		if (coin == 1)
		{
			System.out.println ("You flipped a : Heads \n");
			return true; 			//if random number is one it is heads
		}
		else if (coin == 2)
		{
			System.out.println ("You flipped a : Tails \n");
			return false; 			//if random number is two it is tails
		}
		
		return true; 
	}
	
}
