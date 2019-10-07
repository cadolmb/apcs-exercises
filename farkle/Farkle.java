import java.util.Scanner;

public class Farkle {

    private static Player player1;
    private static Player player2;
    private static int turn;

    public static void main(String[] args) {
        System.out.println("Two Player Farkle!!!");
        Scanner scanner = new Scanner(System.in);

        player1 = new Player(scanner);
        player2 = new Player(scanner);

        // SEE WHO GOES FIRST
        System.out.println("\nRoll to see who goes first: ");
        if (player1.roll() > player2.roll()) {
            turn = 1; // PLAYER 1
            System.out.println("\n" + player1.name() + " You go first");
        }
        else {
            turn = 2;
            System.out.println("\n" + player2.name() + " You go first");
        }

        boolean playing = true;
        while (playing) {
            if (turn == 1) { // player 1's turn
                player1.rollAll();
            }
            if (turn == 2) { // player 2's turn

            }
        }
    }

    private static void countScore() {
    }
}
