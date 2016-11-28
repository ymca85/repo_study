import static org.junit.Assert.*;

import org.junit.Test;

public class InputValidationTests {

	@Test
	public void testIsInputValidRock() {
		
		String input = "rock";
		InputVaidation inputVaidation = new InputVaidation();
		assertSame(true, inputVaidation.isInputValid(input));
	}
	
	@Test
	public void testIsInputValidPaper() {
		
		String input = "paper";
		InputVaidation inputVaidation = new InputVaidation();
		assertSame(true, inputVaidation.isInputValid(input));
	}
	
	@Test
	public void testIsInputValidScissors() {
		
		String input = "scissors";
		InputVaidation inputVaidation = new InputVaidation();
		assertSame(true, inputVaidation.isInputValid(input));
	}

}
