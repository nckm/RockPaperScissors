public interface Player {
    String[] RPSCHOICES = new String[] {"Rock", "Paper", "Scissors"};
    String[] RPSLSCHOCIES = new String[] {"Rock", "Paper", "Scissors", "Lizard", "Spock"};  // Needs implementation

    String makeChoice();
    String getName();
    void setName(String name);
}
