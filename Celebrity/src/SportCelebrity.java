import java.util.ArrayList;


public class SportCelebrity extends Celebrity
{
	
	private int playerNumber;
	private String sportPlayed;
	private String name;
	private ArrayList<String> clueList;

	
	public SportCelebrity(String answer, String clues, int playNum, String sport)
	{
		super(answer, clues);
		
		name = answer;
		sportPlayed = sport;
		playerNumber = playNum;
		
	}
	
	public SportCelebrity(String answer, String clues)
	{
		super(answer, clues);
		name = answer;
		
		sportPlayed = "N/A";
		playerNumber = 0;
		
	}
	
	@Override
	public String getAnswer()
	{
		return name;
	}
	
	
	@Override
	public String toString()
	{
		String dsc = "This is the sport celebrity: " + getAnswer() + "This is the sport they played: " + sportPlayed + " and this is his Jersey Number: " + playerNumber + "\nThe clues are:\n";
		
		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}
		
		
		
		return dsc;
	}
	
	public void setSport(String sport)
	{
		sportPlayed = sport;
	}
	
	public void setNumber(int num)
	{
		playerNumber = num;
	}
	
	public String getSport()
	{
		return sportPlayed;
	}
	
	public int getNumber()
	{
		return playerNumber;
	}
	
	

	
	

}
