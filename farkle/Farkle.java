import java.util.*;

public class Farkle {

    private static Player player1;
    private static Player player2;
    private static int turn;

    public static final int[] pointDice = {1, 5};
    public static final int[] points = {100, 50};

    public static void main(String[] args) {
        System.out.println("Two Player Farkle!!!");
        Scanner scanner = new Scanner(System.in);

        player1 = new Player(scanner);
        player2 = new Player(scanner);

        // SEE WHO GOES FIRST
        System.out.println("\nRoll to see who goes first: ");
        if (player1.roll() > player2.roll()) {
            turn = 1;
            System.out.println("\n" + player1.name() + " You go first");
        }
        else {
            turn = 2;
            System.out.println("\n" + player2.name() + " You go first");
        }

        /*
        GAME TURNS
        */
        boolean playing = true;
        while (playing) {
            boolean farkle = true;
            boolean hotdice = true;

            if (turn == 1) { // player 1's turn
                int[] rolls = player1.rollAll();
                for (int i : rolls) {
                    if (!Util.contains(pointDice, i)) hotdice = false;
                    if (Util.contains(pointDice, i)) farkle = false;
                }
                if (farkle) {

                }
                else if (hotdice) {

                }
                else {
                    int[] aside = player1.setAsideDice(rolls);
                    countScore(aside, player1);
                    System.out.println("Score: " + player2.score());
                }
            }

            if (turn == 2) { // player 2's turn
                int[] rolls = player2.rollAll();
                for (int i : rolls) {
                    if (!Util.contains(pointDice, i)) hotdice = false;
                    if (Util.contains(pointDice, i)) farkle = false;
                }
                if (farkle) {

                }
                else if (hotdice) {

                }
                else {
                    int[] aside = player2.setAsideDice(rolls);
                    countScore(aside, player2);
                    System.out.println("Score: " + player2.score());
                }
            }
        }
    }

    private static void countScore(int[] rolls, Player player) {
        for (int i : rolls) {
            if (i == pointDice[0]) {
                player.addScore(points[0]);
            }
            if (i == pointDice[1]) {
                player.addScore(points[1]);
            }
        }
    }

}
