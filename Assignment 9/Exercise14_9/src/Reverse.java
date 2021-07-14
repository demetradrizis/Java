/*
 * Demetra Drizis 
 * Assignment 9
 */
import java.util.Scanner;
public class Reverse
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence and I will reverse it for you: ");
		
		String sentence;
		sentence = input.nextLine(); 

		String [] tokens = sentence.split(" ");
		
		for(int i = tokens.length-1; i >= 0; --i)
		{			
			System.out.print(tokens[i]+" "); 
		}

	}

}
