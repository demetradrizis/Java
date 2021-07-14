/*
 Demetra Drizis
 Assignment 3
 Exercise 7.16
 */
public class Exercise7_16
{

	public static void main(String[] args) 
	{
		
		double total = 0.0; 
		
		for (String s : args)
		{
			double d = Double.parseDouble(s);
			total = total + d; 
		}
		System.out.println("Sum of the elements: " + total);

	}

}
