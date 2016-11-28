import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicServicetests {

	@Test
	public void testFindAndShowWinner() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame("", gameLogicService.findAndShowWinner("", ""));
	}

}
