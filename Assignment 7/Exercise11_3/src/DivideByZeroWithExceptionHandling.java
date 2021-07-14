/*
 * Demetra Drizis
 * Assignemnt 7
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling 
{
	public static int quotient(int numerator, int denominator) throws ArithmeticException
	{
	    return numerator / denominator; // possible divide by zero exception
	}
	
	public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed
        int numerator = 0;
        int denominator = 0;			//initialize variables outside of try block
        
        do{
        	try
        	{
        		System.out.printf("%nPlease enter an integer numerator: ");
        		numerator = scanner.nextInt();				//enter numerator and denominator
        		
        		System.out.print("Please enter an integer denominator: ");
        		denominator = scanner.nextInt();

            	// try calculating quotient
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n%n", numerator, denominator, result);		//print result
                continueLoop = false;		//if successful, end loop 
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine();							//throw exception if you don't enter number
                System.out.printf("You must enter integers. Please try again.%n%n");
            }
            catch(ArithmeticException arithmeticException)
            {
            	//throw exception if denominator is 0
               System.out.printf("%nException: %s%nOops, can't do that. ", arithmeticException);
               System.out.printf("%nZero is an invalid denominator. Please try again.%n%n");
            }
            finally //finally block
            {
            	//System.out.println();
            	System.out.println("Numerator is " +numerator);
            	System.out.println("Denominator is " +denominator);
            }
        } while (continueLoop);
    }
}

