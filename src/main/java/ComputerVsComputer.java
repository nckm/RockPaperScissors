public class ComputerVsComputer extends Game{
	@Override
	public void createPlayers() {
		player1 = new ComputerPlayer(random);
		player2 = new ComputerPlayer(random);
		player1.setName("");
		player2.setName("");
		System.out.println("\n\nPlayer 1's name is " + player1.getName() + " and player 2 is " + player2.getName() + ".");
	}
}
