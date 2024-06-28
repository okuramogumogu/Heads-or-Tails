import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tossing a coin...");

        int headsCount = 0, tailsCount = 0;
        for (int round = 1; round <= 3; round++) {
            int result = random.nextInt(2); // 0 for Heads, 1 for Tails
            if (result == 0) {
                System.out.println("Round " + round + ": Heads");
                headsCount++;
            } else {
                System.out.println("Round " + round + ": Tails");
                tailsCount++;
            }
        }

        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
        if (headsCount > tailsCount) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
        scanner.close();
    }
}
