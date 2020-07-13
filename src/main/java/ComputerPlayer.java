import java.util.Random;

public class ComputerPlayer implements Player{
	private final Random random;
	private static final String[] NAMES = new String[] {"Computron", "T-1000", "HAL", "Terminator", "Marvin", "R2-D2"};
	private String name;

	public ComputerPlayer(Random random) {
		this.random = random;
	}

	@Override
	public String makeChoice() {
		return RPSCHOICES[this.random.nextInt(RPSCHOICES.length)];
	}

	@Override
	public void setName(String name) {
		this.name = NAMES[random.nextInt(NAMES.length)];
	}

	@Override
	public String getName() {
		return name;
	}
}
