/*Demetra Drizis
  Assignment 3
  Extra Exercise */

import java.util.Random;
import java.security.SecureRandom;

public class Extra_exercise
{
   private static final SecureRandom randomNumbers = new SecureRandom();

   public static void main(String[] args)
   {
      int sum = 0;
      int rows = 6, columns = 4;

      int arr[][];
      arr = new int[rows][columns];    // creating a new integer array

      for (int i = 0; i < rows; i++)
      {
         sum = 0;

         for (int j = 0; j < columns - 1; j++)
         {
            arr[i][j] = random();
            sum += arr[i][j];          // adding the elements of the row
         }

         arr[i][columns - 1] = sum;    // inputting the sum into the last column
      }

      for (int i = 0; i < columns - 1; i++)
      {
         sum = 0;

         for (int j = 0; j < rows - 1; j++)
            sum += arr[j][i];          // adding the elements of the column

         arr[rows - 1][i] = sum;       // inputting sum into last row
      }

      arr[rows - 1][columns - 1] = 0;  // placing final 0 in [6][4]

      for (int i = 0; i < rows; i++)   // printing elements of array
      {
         for (int j = 0; j < columns; j++)
            System.out.print(arr[i][j] + " ");

         System.out.println();
      }
   }

   public static int random()
   {
      Random randomNumbers = new Random();
      return (0 + randomNumbers.nextInt(10));   // returns random num 0-9
   }
}
