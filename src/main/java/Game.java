import java.util.Random;
import java.util.Scanner;

 abstract class Game {
     protected Random random = new Random();
     protected Scanner scanner = new Scanner(System.in);
     protected Player player1;
     protected Player player2;

     private int p1Wins = 0;
     private int p2Wins = 0;

     abstract public void createPlayers();

     public void playGame(){
         createPlayers();

         do {
             String p1Choice = player1.makeChoice();
             String p2Choice = player2.makeChoice();
             System.out.println("\n\n" + p1Choice + " vs " + p2Choice);

             if(p1Choice.equals(p2Choice)) {
                 System.out.println("\nIt's a draw!");
             } else if (("Rock".equals(p1Choice) && "Scissors".equals(p2Choice)) ||
                        ("Scissors".equals(p1Choice) && "Paper".equals(p2Choice)) ||
                        ("Paper".equals(p1Choice) && "Rock".equals(p2Choice))) {
                 System.out.println("\n" + player1.getName() + " wins this round!");
                 p1Wins++;
             } else {
                 assert (("Rock".equals(p2Choice) && "Scissors".equals(p1Choice)) ||
                         ("Scissors".equals(p2Choice) && "Paper".equals(p1Choice)) ||
                         ("Paper".equals(p2Choice) && "Rock".equals(p1Choice)));
                 System.out.println("\n" + player2.getName() + " wins this round!");
                 p2Wins++;
             }

             System.out.println(player1.getName() + " wins: " + p1Wins);
             System.out.println(player2.getName() + " wins: " + p2Wins);
         } while (playAgain(scanner));
     }

     public boolean playAgain(Scanner scanner){
         boolean bestOfThree = false;

         if (p1Wins >= 3) {
             System.out.println(player1.getName() + " wins this game!");
             bestOfThree = true;
         } else if (p2Wins >= 3) {
             System.out.println(player2.getName() + " wins this game!");
             bestOfThree = true;
         }

         if (bestOfThree) {
             System.out.println("\n\nPlay Again?");
             System.out.println("1) Yes");
             System.out.println("2) No");

             switch(scanner.nextInt()) {
                 case 1:
                     System.out.println("\n\nWelcome back to Rock, Paper, Scissors!");
                     return true;
                 case 2:
                     System.out.println("Thanks for playing!");
                     return false;
                 default:
                     System.out.println("That wasn't a recognised input, game over!");
                     return false;
             }
         }
         return true;
     }
}
