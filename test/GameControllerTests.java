import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.Test;

public class GameControllerTests {

//	@Test
//	public void test() {
//		GameController gameController = new GameController();
//		gameController.displayGameStartInformation();
//	}
	
	@Test
	public void testGetFirstInputFromConsoleValue1() {
		
		GameController gameController = new GameController();
		System.setIn(new ByteArrayInputStream("rock".getBytes()));
		Scanner scanner = new Scanner(System.in);
		
		String inputFromConsole = gameController.getFirstInputFromConsole(scanner);
		assertEquals("rock", inputFromConsole);
		
		System.setIn(System.in);
	}
	
	@Test
	public void testGetFirstInputFromConsolevalue2() {
		GameController gameController = new GameController();
		Scanner scanner = new Scanner("scissors");
		String inputFromConsole = gameController.getFirstInputFromConsole(scanner);
		assertSame("scissors", inputFromConsole);
	}

}
