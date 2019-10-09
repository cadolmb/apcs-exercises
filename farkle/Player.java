import java.util.*;

public class Player {

    public int score;
    public String name;
    private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
        score = 0;
        System.out.println("\nEnter your name: ");
        name = scanner.nextLine();
    }

    public int roll() {
        System.out.print("\n" + name + " - Press ENTER to roll");
        scanner.nextLine();
        Random random = new Random();
        int n = random.nextInt(6) + 1;
        System.out.println(name + " you rolled a " + n);
        return n;
    }

    public int[] rollAll() {
        System.out.print("\n" + name + " - Press ENTER to roll all 6 dice");
        scanner.nextLine();
        Random random = new Random();
        int[] rolls = new int[6];
        for (int i = 0; i < 6; i++) {
            int n = random.nextInt(6) + 1;
            rolls[i] = n;
        }
        System.out.print(name + " - you rolled: ");
        for (int i : rolls) { System.out.print(i + " "); }
        System.out.println();
        return rolls;
    }

    public int[] setAsideDice(int[] rolls) {
        System.out.println("Enter the numbers you want to set aside: (ex: 1 or 1, 2)");
        String[] input = scanner.nextLine().split(",");
        int[] aside = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            aside[i] = Integer.parseInt(input[i]);
        }
        for (int i : aside) {
            if (!Util.contains(Farkle.pointDice, i)) {
                Util.inputError();
            }
        }
        return aside;
    }

    public void addScore(int i) {
        score += i;
    }

    public int score() {
        return score;
    }
    
    public String name() {
        return name;
    }
}
