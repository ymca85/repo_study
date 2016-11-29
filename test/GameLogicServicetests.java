import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicServicetests {

	@Test
	public void testFindAndShowWinnerRockVsScissors() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "rock";
		String input2 = "scissors";
		assertSame(MessageConstants.ROCK_CRUSHES_SCISSORS, gameLogicService.findAndShowWinner(input1, input2));
	}
	
	@Test
	public void testFindAndShowWinnerRockVsPaper() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "rock";
		String input2 = "paper";
		assertSame(MessageConstants.PAPER_COVERS_ROCK, gameLogicService.findAndShowWinner(input1, input2));
	}
	
	@Test
	public void testFindAndShowWinnerPaperVsScissors() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "paper";
		String input2 = "scissors";
		assertSame(MessageConstants.SCISSORS_CUT_PAPER, gameLogicService.findAndShowWinner(input1, input2));
	}
	
	@Test
	public void testFindAndShowWinnerPaperVsRock() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "paper";
		String input2 = "rock";
		assertSame(MessageConstants.PAPER_COVERS_ROCK, gameLogicService.findAndShowWinner(input1, input2));
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
