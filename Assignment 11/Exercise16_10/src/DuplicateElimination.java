/* Demetra Drizis
 * Assignment 11
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElimination
{

	static ArrayList<String> removeDup(ArrayList<String> list) 
	{

		ArrayList<String> answer = new ArrayList<>();
		HashSet<String> set = new HashSet<>();

		for (String name : list)
		{
			if (!set.contains(name))
			{
				answer.add(name);
				set.add(name);

  
			}
		}
		return answer;
	}

public static void main(String[] args)
{
  
	System.out.println("\nEnter the number of names you would like to enter into a list:");
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();

	System.out.println("\nEnter the names:");
	ArrayList<String> mylist = new ArrayList<>();
	for(int i = 0;i <= n; i++)
	{
		mylist.add(sc.nextLine());
	}

	ArrayList<String> seperate = removeDup(mylist);
	System.out.println("\nNames after removing dublicates:");
		for (String single : seperate) 
		{
			System.out.println(single);
		}
  
		System.out.println("\nEnter the first name to be searched");
		String check = sc.nextLine();
		int index = mylist.indexOf(check);
		if(index == -1)
		{
			System.out.println("\nThe list does not contain the first name " + check);
		}
		else
		{
			System.out.print("\nThe list holds the name " + check);

			System.out.println(" at index: " + index);

		}
}
}


