public class TTTBoard{
	
	private char[][] board;   // The tic-tac-toe board
	   
	   // Instantiate an empty board
	   public TTTBoard(){
	      board = new char[3][3];
	      reset();
	   }
  
	// Reset the board to empty
	   public void reset(){
	      for (int row = 0; row < 3; row++)
	         for (int column = 0; column < 3; column++)
	            board[row][column] = '-';
	   }   
  
	// Return a string representation of the board
	   public String toString(){
	      String result = "\n";
	      for (int row = 0; row < 3; row++){
	         for (int column = 0; column < 3; column++)
	            result += board[row][column] + " ";
	         result += "\n";
	      }
	      return result;
	   }
  
	// If the move is legal, make it and return true, else return false
	   public boolean placeXorO(char s, int row, int column){
	      if (board[row - 1][column - 1] == '-'){
	         board[row - 1][column - 1] = s;
	         return true;
	      }else
	         return false;
	   }
  
	// Return true if the board is full else return false
	   public boolean full(){
	      for (int row = 0; row < 3; row++)
	       for (int column = 0; column < 3; column++)
	        if (board[row][column] == '-')
	         return false;
	      return true;
	   }
  
  public char getWinner(){
    char winner='-';
    for(int row=0; row<3; row++){
      if(board[row][0] == board[row][1] && board[row][1] == board[row][2])
      {
        winner=board[row][1];
      }
    }
    for(int column=0; column<3; column++)
    {
      if(board[0][column] == board[1][column] && board[1][column] == board[2][column])
      {
        winner=board[0][column];
      }
    }
    if(board[0][0] == board[1][1] && board[1][1] == board[2][2] || board[0][2] == board[1][1] && board[1][1] == board[2][0])
      {
    	winner=board[1][1];
      }
    
    return winner;
  }
}