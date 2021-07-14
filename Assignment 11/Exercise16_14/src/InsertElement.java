/* Demetra Drizis
 * Assignment 11
 */

import java.util.*;
public class InsertElement
{

     public static void main(String []args)
     {
         LinkedList<Integer> list=new LinkedList<Integer>();
         Random randomGenerator = new Random();
         
        for (int i = 0; i < 25; i++)
          list.add(randomGenerator.nextInt(100));
          Collections.sort(list);
          int sum = 0;
          
          for(int i = 0; i < 25; i++)
          {
              sum += list.get(i);
          }
          
          double average = sum/25.00;
          
        System.out.println("List: "+ list);
        System.out.println("Sum of elements: "+sum);
        System.out.printf("Average: %.2f ", average);
     }
}

