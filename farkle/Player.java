import java.util.Scanner;
import java.util.Random;

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
        System.out.println(name + " you rolled " + rolls);
        return rolls;
    }

    public void addScore(int i) {
        score += i;
    }

    public String name() {
        return name;
    }
}
