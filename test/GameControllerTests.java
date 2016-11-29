import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class GameControllerTests {

	@Test
	public void test() {
		GameController gameController = new GameController();
		gameController.displayGameStartInformation();
	}
	
	@Test
	public void testGetFirstInputFromConsoleValue1() {
		GameController gameController = new GameController();
		Scanner scanner = new Scanner("rock");
		String inputFromConsole = gameController.getFirstInputFromConsole(scanner);
		assertSame("rock", inputFromConsole);
	}
	
	@Test
	public void testGetFirstInputFromConsolevalue2() {
		GameController gameController = new GameController();
		Scanner scanner = new Scanner("scissors");
		String inputFromConsole = gameController.getFirstInputFromConsole(scanner);
		assertSame("scissors", inputFromConsole);
	}

}
