import java.util.*;

public class Player {

    private int score;
    private String name;
    private Scanner scanner;

    public Player(Scanner scanner, int n) {
        this.scanner = scanner;
        score = 0;
        System.out.println("\nPlayer " + n + " Enter your name: ");
        name = scanner.nextLine();
    }

    public int roll() {
        System.out.print("\n" + name + " - Press ENTER to roll");
        scanner.nextLine();
        Random random = new Random();
        int n = random.nextInt(6) + 1;
        System.out.println(name + " - you rolled a " + n);
        return n;
    }

    public int[] roll(int n) {
        System.out.print("\nPress ENTER to roll " + n + " dice");
        scanner.nextLine();
        Random random = new Random();
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(n) + 1;
            rolls[i] = r;
        }
        System.out.print("You rolled: ");
        for (int i : rolls) { System.out.print(i + " "); }
        System.out.println();
        return rolls;
    }

    public int[] setAsideDice(int[] rolls) {
        System.out.println("Enter the numbers you want to set aside: (ex: 1 or 1,5)");
        String[] input = scanner.nextLine().split(",");
        int[] aside = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            aside[i] = Integer.parseInt(input[i]);
        }
        return aside;
    }

    public boolean endTurn() {
        System.out.print("Would you like to continue rolling? (y/n) ");
        char c = Character.toLowerCase(scanner.nextLine().charAt(0));
        if (c == 'y') {
            return false;
        }
        else if (c == 'n') {
            return true;
        }
        else {
            System.out.println("\n Invalid Input");
            System.exit(0);
            return false;
        }
    }

    public void addScore(int i) {
        score += i;
        System.out.println("You got " + i + " points!");
    }

    public int score() {
        return score;
    }

    public String name() {
        return name;
    }
}
