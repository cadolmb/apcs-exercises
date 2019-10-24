import java.util.*;

public class Farkle {

    private static Player player1;
    private static Player player2;
    private static int turn;
    private static int winner;
    public static final int maxScore = 10000;

    public static void main(String[] args) {
        System.out.println("\n\n\n---Two Player Farkle---");
        Scanner scanner = new Scanner(System.in);

        player1 = new Player(scanner, 1);
        player2 = new Player(scanner, 2);

        // SEE WHO GOES FIRST
        System.out.println("\n\n\nRoll to see who goes first: ");
        if (player1.roll() > player2.roll()) {
            turn = 1;
            System.out.println("\n" + player1.name() + " You go first");
        }
        else {
            turn = 2;
            System.out.println("\n" + player2.name() + " You go first");
        }

        /*
        GAME LOOP
        */
        boolean playing = true;
        boolean lastTurn = false;
        while (playing) {
            boolean farkle = true;
            boolean hotdice = true;

            if (turn == 1 || true) { // player 1's turn
                System.out.println("\n\n\n-- " + player1.name() + "'s turn --");
                int numToRoll = 6;
                ArrayList<Integer> asideList = new ArrayList<Integer>();
                boolean rolling = true;

                while (rolling) {
                    // ROLL DICE
                    int[] rolls = player1.roll(numToRoll);
                    for (int i : rolls) {
                        if (!isPointDice(i)) hotdice = false;
                        if (isPointDice(i)) farkle = false;
                    }
                    if (farkle) {

                    }
                    else if (hotdice) {

                    }
                    else {
                        int[] setAside = player1.setAsideDice(rolls); // get array of dice set aside
                        for (int i : setAside) { asideList.add(i); } // add to aside list
                        numToRoll -= setAside.length;
                        //countScore(aside(asideList), player1);
                        //System.out.println("Score: " + player1.score());
                        System.out.println("You set aside: " + asideList);
                        if (player1.endTurn()) {
                            rolling = false;
                            turn = 2;
                            int[] finalAside = new int[asideList.size()];
                            for (int i = 0; i < asideList.size(); i++) {
                                finalAside[i] = asideList.get(i);
                            }
                            countScore(finalAside, player1);
                        }
                        else {
                            // PLAYER CONTINUES TURN
                        }
                    }

                    if (lastTurn) {
                        if (player1.score() > player2.score()) {
                            winner = 1;
                            playing = false;
                        }
                        else {
                            winner = 2;
                            playing = false;
                        }
                    }
                    else {
                        turn = 2;
                        if (player1.score() > maxScore)
                            lastTurn = true;
                    }
                }
            }

            else if (turn == 2 && false) { // player 2's turn
                System.out.println("\n\n\n-- " + player2.name() + "'s turn --");
                int numToRoll = 6;
                ArrayList<Integer> asideList = new ArrayList<Integer>();
                boolean rolling = true;

                while (rolling) {
                    // ROLL DICE
                    int[] rolls = player2.roll(numToRoll);
                    for (int i : rolls) {
                        if (!isPointDice(i)) hotdice = false;
                        if (isPointDice(i)) farkle = false;
                    }
                    if (farkle) {

                    }
                    else if (hotdice) {

                    }
                    else {
                        int[] setAside = player2.setAsideDice(rolls); // get array of dice set aside
                        for (int i : setAside) { asideList.add(i); } // add to aside list
                        numToRoll -= setAside.length;
                        //countScore(aside(asideList), player2);
                        //System.out.println("Score: " + player2.score());
                        System.out.println("You set aside: " + asideList);
                        if (player2.endTurn()) {
                            rolling = false;
                            turn = 2;
                            int[] finalAside = new int[asideList.size()];
                            for (int i = 0; i < asideList.size(); i++) {
                                finalAside[i] = asideList.get(i);
                            }
                            countScore(finalAside, player2);
                        }
                        else {
                            // PLAYER CONTINUES TURN
                        }
                    }


                    if (lastTurn) {
                        if (player1.score() > player2.score()) {
                            winner = 1;
                            playing = false;
                        }
                        else {
                            winner = 2;
                            playing = false;
                        }
                    }
                    else {
                        turn = 1;
                        if (player2.score() > maxScore)
                            lastTurn = true;
                    }
                }
            }
        }
    }

    private static void countScore(int[] rolls, Player player) {
        Arrays.sort(rolls);
        int points = 0;

        // TRIPLES
        if (rolls.length == 3) {
            System.out.println("testing for triples");
            for (int i : rolls) {System.out.println(i);}
            if (Arrays.equals(rolls, new int[]{1,1,1})) {
                points += 300;
            }
            else if (Arrays.equals(rolls, new int[]{2,2,2})) {
                points += 200;
            }
            else if (Arrays.equals(rolls, new int[]{3,3,3})) {
                points += 300;
            }
            else if (Arrays.equals(rolls, new int[]{4,4,4})) {
                points += 400;
            }
            else if (Arrays.equals(rolls, new int[]{5,5,5})) {
                points += 500;
            }
            else if (Arrays.equals(rolls, new int[]{6,6,6})) {
                points += 600;
            }
        }
        else if (rolls.length == 6) {
            if (Arrays.equals(rolls, new int[]{1,2,3,4,5,6})) { // 1-6 straight
                points += 1500;
            }
            else if (rolls[0] == rolls[1] && rolls[2] == rolls[3] && rolls[4] == rolls[5]) {  // 3 pairs
                points += 1500;
            }
        }

        for (int i : new int[]{1,2,3,4,5,6}) {
            if (Arrays.equals(rolls, new int[]{i,i,i,i})) {  // 4 of a kind
                points += 1000;
            }
            else if (Arrays.equals(rolls, new int[]{i,i,i,i,i})) {  // 5 of a kind
                points += 2000;
            }
            else if (Arrays.equals(rolls, new int[]{i,i,i,i,i,i})) {  // 6 of a kind
                points += 3000;
            }
        }

        for (int i : rolls) {
            if (i == 1) {
                points += 100;
            }
            else if (i == 5) {
                points += 50;
            }
        }
        
        player.addScore(points);
    }

    public static boolean isPointDice(int n) {
        boolean b = false;
        for (int i : new int[]{1,5}) {
            if (i == n)
                b = true;
        }
        return b;
    }

    public static int[] aside(ArrayList<Integer> list) {
        int l = list.size();
        int[] array = new int[l];
        for (int i = 0; i < l; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
