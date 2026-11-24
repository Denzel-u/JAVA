import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = input.nextLine().toLowerCase();

        boolean palindrome = true;

        for (int counter = 0; counter < text.length() / 2; counter++) {

            if (text.charAt(counter) != text.charAt(text.length() - 1 - counter)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        input.close();
    }
}
