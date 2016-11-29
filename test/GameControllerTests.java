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
	public void testGetFirstInputFromConsole() {
		GameController gameController = new GameController();
		Scanner scanner = new Scanner("rock");
		gameController.getFirstInputFromConsole(scanner);
	}

}
