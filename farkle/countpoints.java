import java.util.*;

public class countpoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = args[0].split(",");
        int[] rolls = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            rolls[i] = Integer.parseInt(input[i]);
        }

        countScore(rolls);
    }

    private static void countScore(int[] rolls) {
        Arrays.sort(rolls);
        int points = 0;

        int[] count = new int[rolls.length];
        for (int i : rolls) {
            count[i] += 1;
        }

        // TRIPLES
        if (rolls.length == 3) {
            if (Arrays.equals(rolls, new int[]{1,1,1})) {
                points += 1000;
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

        System.out.println("You got: " + points + " points!");
    }
}
