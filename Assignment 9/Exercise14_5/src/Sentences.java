/*
 * Demetra Drizis 
 * Assignment 9
 */
// Program randomly generates sentences.
public class Sentences 
{

	public static void main(String[] args)
	{
		String article[] = { "the ", "a ", "one ", "some ", "any "};
		String noun[] = {"boy", "girl", "dog", "town", "car"};
		String verb[] = {" drove", " jumped", " ran", " walked", " skipped"};	
		String preposition[] =	{" to ", " from ", " over ", " under ", " on "};
		
		StringBuilder buffer = new StringBuilder(); 
		StringBuilder buffer2 = new StringBuilder(); 
		
		// randomly create sentence
		for (int i = 1; i <= 20; i++)
		{
			int article_1 = (int)(Math.random() * 5);
			int noun_1 = (int)(Math.random() * 5);
			int verb_1 = (int)(Math.random() * 5);
			int preposition_2 = (int)(Math.random() * 5);
			int article_2 = (int)(Math.random() * 5);
			int noun_2 = (int)(Math.random() * 5);

			// concatenate words and add period
			buffer.append(article[article_1] + noun[noun_1] +
			verb[verb_1] + preposition[preposition_2] +
			article[article_2] + noun[noun_2] + ".\n");

			// capitalize first letter	
			buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
			buffer2.append(buffer);
			buffer = new StringBuilder();

		}
		
		System.out.printf("%s", buffer2.toString());
	}

} // end class Sentences 