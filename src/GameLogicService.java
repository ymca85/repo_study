
public class GameLogicService {

	public String findAndShowWinner(String input1, String input2) {

		String message = "";

		if (input1.equals(input2)) {
			message = MessageConstants.TIE_SAME_OPTIONS_SELECTED;
		} else if (input1.equals(UserInputs.ROCK.toString()) && input2.equals(UserInputs.SCISSORS.toString())) {
			message = MessageConstants.ROCK_CRUSHES_SCISSORS;
		} else if (input1.equals(UserInputs.PAPER.toString()) && input2.equals(UserInputs.ROCK.toString())) {
			message = MessageConstants.PAPER_COVERS_ROCK;
		} else if (input1.equals(UserInputs.SCISSORS.toString()) && input2.equals(UserInputs.PAPER.toString())) {
			message = MessageConstants.SCISSORS_CUT_PAPER;
		}
		return message;
	}
}
