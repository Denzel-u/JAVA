import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = input.nextLine();

        String reversed = "";

        for (int counter = word.length() - 1; counter >= 0; counter--) {
            reversed = reversed + word.charAt(counter);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
