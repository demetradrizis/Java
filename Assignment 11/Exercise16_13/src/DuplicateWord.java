/* Demetra Drizis
 * Assignment 11
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class DuplicateWord
{

    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter a sentence: ");
    	
    	String sentence;
		sentence = input.nextLine(); 
		String sentence2 = sentence.toLowerCase(); 
		sentence2 = sentence2.replaceAll("\\p{Punct}", "");
        Set<String> duplicates = duplicateWords(sentence2);
        System.out.println("Input : " + sentence);
        System.out.println("Duplicates : " + duplicates);
    }

    public static Set<String> duplicateWords(String input)
    {
        
        if(input == null || input.isEmpty())
        {
            return Collections.emptySet();
        }
        
        Set<String> duplicates = new HashSet<>();
        
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();
        
        for(String word : words)
        {	
            if(!set.add(word))
            {
                duplicates.add(word);
            }
        }
        return duplicates;
    }


}
