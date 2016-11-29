import static org.junit.Assert.*;
import org.junit.Test;

public class GameLogicServicetests {

	@Test
	public void testFindAndShowWinnerRockVsPaper() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "rock";
		String input2 = "paper";
		assertSame(MessageConstants.PAPER_COVERS_ROCK, gameLogicService.findAndShowWinner(input1, input2));
	}

	@Test
	public void testFindAndShowWinnerRockVsScissors() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "rock";
		String input2 = "scissors";
		assertSame(MessageConstants.ROCK_CRUSHES_SCISSORS, gameLogicService.findAndShowWinner(input1, input2));
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
	public void testFindAndShowWinnerScissorsVsRock() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "scissors";
		String input2 = "rock";
		assertSame(MessageConstants.ROCK_CRUSHES_SCISSORS, gameLogicService.findAndShowWinner(input1, input2));
	}

	@Test
	public void testFindAndShowWinnerScissorsVsPaper() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "scissors";
		String input2 = "paper";
		assertSame(MessageConstants.SCISSORS_CUT_PAPER, gameLogicService.findAndShowWinner(input1, input2));
	}

	@Test
	public void testFindAndShowWinnerThisIsTie() {
		GameLogicService gameLogicService = new GameLogicService();
		String input1 = "scissors";
		String input2 = "scissors";
		assertSame(MessageConstants.TIE_SAME_OPTIONS_SELECTED, gameLogicService.findAndShowWinner(input1, input2));
	}

}
