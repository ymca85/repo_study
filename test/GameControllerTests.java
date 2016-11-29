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
	public void testGetInputFromConsoleValue1() {
		
		GameController gameController = new GameController();
		System.setIn(new ByteArrayInputStream("rock".getBytes()));
		Scanner scanner = new Scanner(System.in);
		
		String inputFromConsole = gameController.getInputFromConsole(scanner);
		assertEquals("rock", inputFromConsole);
		
		System.setIn(System.in);
	}
	
	@Test
	public void testGetInputFromConsolevalue2() {

		GameController gameController = new GameController();
		System.setIn(new ByteArrayInputStream("scissors".getBytes()));
		Scanner scanner = new Scanner(System.in);
		
		String inputFromConsole = gameController.getInputFromConsole(scanner);
		assertEquals("scissors", inputFromConsole);
		
		System.setIn(System.in);
	}

}
