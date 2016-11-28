
public class InputVaidation {

	public boolean isInputValid(String input) {
		if (input.equals(UserInputs.ROCK.toString()) || input.equals(UserInputs.PAPER.toString())
				|| input.equals(UserInputs.SCISSORS.toString())) {
			return true;
		}
		return false;
	}
}
