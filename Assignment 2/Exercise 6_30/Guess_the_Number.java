/* Demetra Drizis
 * Assignment 2
 * Exercise 6.30
 */

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner; 

public class Guess_the_Number
{
	private static final SecureRandom randomNumbers = new SecureRandom(); 	//random number generator 
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int guess; 
		char again; 
		
	do 
	{	
			int random_num = random(); 					//declaring variables
			System.out.println("Guess a number bewtween 1 and 1000 and I will tell you if you are too high or too low");
			System.out.println("Enter your guess: "); 
			guess = input.nextInt(); 			//taking in user input for the random number
		
		do 
		{
			if (random_num < guess)
			{
				System.out.println("Too High. Try agan: ");
				guess = input.nextInt();							//if the number guessed is higher than the random number prints "too high"
			}
			else if (random_num > guess)
			{
				System.out.println("Too Low. Try again: ");			//if the number guessed is lower than the random number prints "too low"
				guess = input.nextInt();
			}
		}while(random_num != guess);
		
	
			System.out.println("Congratulations. You guessed the number!\n");
			System.out.println("Do you want to play again? Press y for yes or n for no ");	//ask if they want to play again
			again = input.next().charAt(0);
				if (again == 'N' || again == 'n')
				{
					break;												//break out of the loop if no 
				}
		
		
		
	}while(again != 'n' || again != 'N');
	

	System.out.println("Thanks for playing!"); 	
	
		
	
				
}


public static int random()
{
	int number;
	
	Random randomNumbers = new Random();
	
	number = 1 + randomNumbers.nextInt(1000); 					//function for random number between 1 and 1000
	
	System.out.println(number);
	
	return number;
		
}
	

}
