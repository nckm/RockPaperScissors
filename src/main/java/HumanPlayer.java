import java.util.Scanner;

public class HumanPlayer implements Player{
	private Scanner scanner;
	private String name;

	public HumanPlayer(Scanner scanner) {
		this.scanner = scanner;
	}


	@Override
	public String makeChoice() {
		System.out.println("Please choose from one of the following:");
		System.out.println("1) Rock");
		System.out.println("2) Paper");
		System.out.println("3) Scissors");

		int choice = this.scanner.nextInt();
		return RPSCHOICES[choice - 1];
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}
