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
	
	@Test
	public void testFindAndShowWinnerScissorsCutPaper() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame("scissors cut paper -> scissors wins", gameLogicService.findAndShowWinner("scissors", "paper"));
	}
	
	@Test
	public void testFindAndShowWinnerThisIsTie() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame("Tie - both the players choose the same object", gameLogicService.findAndShowWinner("rock", "rock"));
	}

}
