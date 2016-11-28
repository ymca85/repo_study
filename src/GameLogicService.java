
public class GameLogicService {
	
	public String findAndShowWinner(String input, String input2) {
		
		String message = "";
		
		if(input == "rock" && input2 == "scissors") {
			message = "rock crushes scissors -> rock wins";
		}
		return message;
	}
}
