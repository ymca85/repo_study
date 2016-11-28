import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicServicetests {

	@Test
	public void testFindAndShowWinnerRockCrushesScissors() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame("rock crushes scissors -> rock wins", gameLogicService.findAndShowWinner("rock", "scissors"));
	}
	
	@Test
	public void testFindAndShowWinnerPaperCoversRock() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame("paper covers rock -> paper wins", gameLogicService.findAndShowWinner("paper", "rock"));
	}

}
