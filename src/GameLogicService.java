
public class GameLogicService {
	
	public String findAndShowWinner(String input, String input2) {
		
		String message = "";
		
		if(input == input2) {
			message = MessageConstants.TIE_SAME_OPTIONS_SELECTED;
		} else if(input == "rock" && input2 == "scissors") {
			message = MessageConstants.ROCK_CRUSHES_SCISSORS;
		} else if(input == "paper" && input2 == "rock") {
			message = MessageConstants.PAPER_COVERS_ROCK;
		} else if (input == "scissors" && input2 == "paper") {
			message = MessageConstants.SCISSORS_CUT_PAPER;
		}
		return message;
	}
}
