import static org.junit.Assert.*;

import org.junit.Test;

public class InputValidationTests {

	@Test
	public void testIsInputValid() {
		
		String input = "rock";
		InputVaidation inputVaidation = new InputVaidation();
		assertSame(true, inputVaidation.isInputValid(input));
	}

}
