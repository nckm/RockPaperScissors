public class HumanVsComputer extends Game{

	@Override
	public void createPlayers() {
		player1 = new HumanPlayer(scanner);
		player2 = new ComputerPlayer(random);

		System.out.print("\nPlayer 1 - please type your name: ");

		player1.setName(scanner.nextLine());
		player2.setName("");

		System.out.println("\n\nPlayer 1's name is " + player1.getName() + " and player 2 is " + player2.getName() + ".");
	}
}
