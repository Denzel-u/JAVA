import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = input.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } else if (guess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
            }

        } while (guess != secretNumber);

        System.out.println("Number of attempts: " + attempts);
    }
}
