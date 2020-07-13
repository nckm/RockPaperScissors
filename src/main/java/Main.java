import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Game starts here
		// Display menu
		// Choose which game to play from the menu
		Scanner userInput = new Scanner(System.in);
		menu(userInput);
		// TODO: Implement Lizard, Spock into RPS choices
	}

	public static void menu(Scanner scanner) {
		System.out.println("\n\nWelcome to Rock, Paper, Scissors!");
		System.out.println("Please choose a game type:");
		System.out.println("1) Human vs Computer");
		System.out.println("2) Computer vs Computer");
		System.out.println("3) Human vs Human");
		System.out.print("\nPlease choose from one of the above options:");

		switch (scanner.nextInt()) {
			case 1:
				System.out.println("You have chosen: Human vs Computer");
				Game hvc = new HumanVsComputer();
				hvc.playGame();
				break;
			case 2:
				System.out.println("You have chosen: Computer vs Computer");
				Game cvc = new ComputerVsComputer();
				cvc.playGame();
				break;
			case 3:
				System.out.println("You have chosen: Human vs Human");
				Game hvh = new HumanVsHuman();
				hvh.playGame();
				break;
			default:
				System.out.println("Input not recognised, please try again!");
				System.exit(0);
		}
	}
}