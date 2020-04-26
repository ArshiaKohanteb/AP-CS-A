//ARSHIA KOHANTEB - 25 Minute AP QUIZ - Q1

public class WordPairList {

	private ArrayList<WordPair> allPairs;

	public WordPairList(String[] words) 
	{
		allPairs = new ArrayList<WordPair>();
		for(int i = 0; i < words.length;i++)
		{
			for(int j = 0; j < words.length; j++)
			{
				if(j != i) 
				{
					allPairs.add(WordPair(words[i],words[j]));
				}
			}
		}
	}

	public int numMatches() 
	{
		for(WordPair pair: allPairs) 
		{
			int returned = 0;
			if((pair.getFirst()).equals(pair.getSecond)) 
			{
				returned++;
			}
			
			return returned;
		}
	}
}