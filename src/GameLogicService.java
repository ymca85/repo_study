
public class GameLogicService {
	
	public String findAndShowWinner(String input, String input2) {
		
		String message = "";
		
		if(input == "rock" && input2 == "scissors") {
			message = "rock crushes scissors -> rock wins";
		} else if(input == "paper" && input2 == "rock") {
			message = "paper covers rock -> paper wins";
		} else if (input == "scissors" && input2 == "paper") {
			message = "scissors cut paper -> scissors wins";
		}
		return message;
	}
}
