public class HumanVsHuman extends Game{

	@Override
	public void createPlayers() {
		player1 = new HumanPlayer(scanner);
		player2 = new HumanPlayer(scanner);

		System.out.print("Player 1 - please type your name: ");
		player1.setName(scanner.nextLine());

		System.out.print("Player 2 - please type your name: ");
		player2.setName(scanner.nextLine());

		System.out.println("\n\nPlayer 1's name is " + player1.getName() + " and player 2 is " + player2.getName() + ".");
	}
}
