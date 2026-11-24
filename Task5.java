import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int counter = 0; counter < word.length(); counter++) {
            char letter = Character.toLowerCase(word.charAt(counter));

            if (letter >= 'a' && letter <= 'z') {
                if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
