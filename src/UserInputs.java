
public enum UserInputs {

	ROCK ("rock"),
	PAPER ("paper"),
	SCISSORS ("scissors");
	
	private final String textValue;
	
	private UserInputs(final String textValue) {
		this.textValue = textValue;
	}
	
	@Override
	public String toString() {
		return textValue;
	}
}
