import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicServicetests {

	@Test
	public void testFindAndShowWinnerRockCrushesScissors() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame(MessageConstants.ROCK_CRUSHES_SCISSORS, gameLogicService.findAndShowWinner(UserInputs.ROCK.toString(), UserInputs.SCISSORS.toString()));
	}
	
	@Test
	public void testFindAndShowWinnerPaperCoversRock() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame(MessageConstants.PAPER_COVERS_ROCK, gameLogicService.findAndShowWinner(UserInputs.PAPER.toString(), UserInputs.ROCK.toString()));
	}
	
	@Test
	public void testFindAndShowWinnerScissorsCutPaper() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame(MessageConstants.SCISSORS_CUT_PAPER, gameLogicService.findAndShowWinner(UserInputs.SCISSORS.toString(), UserInputs.PAPER.toString()));
	}
	
	@Test
	public void testFindAndShowWinnerThisIsTie() {
		GameLogicService gameLogicService = new GameLogicService();
		assertSame(MessageConstants.TIE_SAME_OPTIONS_SELECTED, gameLogicService.findAndShowWinner(UserInputs.ROCK.toString(), UserInputs.ROCK.toString()));
	}

}
