//ARSHIA KOHANTEB - 25 Minute AP QUIZ - Q2

 public static int totalLetters(List<String> wordList) 
 {
	 int returned = 0;
	 
	 for(String word: wordList) 
	 {
		 returned += word.length();
	 }
	 
	 return returned;
	 
 }
 
 public static int basicGapWidth(List<String> wordList, int formattedLen) 
 {
	 int total = totalLetters(wordList);
	 int returned = formattedLen - total;
	 //divide by the amount of gaps
	 returned = returned / (wordList.Length() - 1);
	 
	 return returned;
 }