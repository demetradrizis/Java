/* Demetra Drizis
 * Assignment 11
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount
{ 
    static void characterCount(String inputString) 
    { 
        // Creating a HashMap containing char 
        // as a key and occurrences as  a value 
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
  
        // Converting given string to char array 
  
        char[] Array = inputString.toCharArray(); 
  
        // checking each char of strArray 
        for (char c : Array) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
        } 
  
        // Printing the charCountMap 
        for (Map.Entry entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
    	Scanner input = new Scanner(System.in);	
    	System.out.println("Enter a sentence: ");
    	String sentence;
		sentence = input.nextLine(); 
        characterCount(sentence); 
    } 
} 