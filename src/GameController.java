import java.util.Scanner;

public class GameController {

	
	public static void main(String[] args) {
		GameController gameController = new GameController();
		
		gameController.displayGameStartInformation();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter input for Player1: ");
		String input1 = gameController.getInputFromConsole(scanner);
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
