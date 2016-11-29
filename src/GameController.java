import java.util.Scanner;

public class GameController {

	
	public static void main(String[] args) {
		
		GameController gameController = new GameController();
		InputVaidation inputVaidation = new InputVaidation();
		GameLogicService gameLogicService = new GameLogicService();
		
		gameController.displayGameStartInformation();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter input for Player1: ");
		String input1 = gameController.getInputFromConsole(scanner);
		if(!inputVaidation.isInputValid(input1)) {
			System.out.println(input1
					+ " is not a valid input, please try again by selecting one of the input as rock/paper/scissors.");
		}
		
		System.out.println("Enter input for Player2: ");
		String input2 = gameController.getInputFromConsole(scanner);
		if(!inputVaidation.isInputValid(input2)) {
			System.out.println(input2
					+ " is not a valid input, please try again by selecting one of the input as rock/paper/scissors.");
		}
		
		String resultMessage = gameLogicService.findAndShowWinner(input1, input2);
		System.out.println(resultMessage);
	}
	
	public void displayGameStartInformation() {
		System.out.println(" Hi .. This is rock-paper-scissor game."
				+ "\n It will be played by two player. Each player has to enter his choice for rock / paper / scissor."
				+ "\n The winner will be selected depending upon input." + "\n Let's start the game.");

	}

	public String getInputFromConsole(Scanner scanner) {
		return scanner.nextLine();
	}

}
