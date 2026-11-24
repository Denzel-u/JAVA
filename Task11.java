import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        String word = "";

        for (int counter = 0; counter < sentence.length(); counter++) {
            char letter = sentence.charAt(counter);

            if (letter != ' ') {
                word = word + letter;
            } else {
                if (word.length() > 0) {
                    System.out.println(word);
                    word = "";
                }
            }
        }

        if (word.length() > 0) {
            System.out.println(word);
        }
    }
}
