import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ISBN-13: ");
        String isbn = input.nextLine();

        if (isbn.length() != 13) {
            System.out.println("Invalid ISBN");
        } else {
            int sum = 0;
            boolean valid = true;

            for (int counter = 0; counter < 13; counter++) {
                char digit = isbn.charAt(counter);

                if (digit < '0' || digit > '9') {
                    valid = false;
                    break;
                }

                if (counter < 12) {
                    int number = digit - '0';

                    if (counter % 2 == 0) {
                        sum = sum + number;
                    } else {
                        sum = sum + (3 * number);
                    }
                }
            }

            if (valid) {
                int checkDigit = (10 - (sum % 10)) % 10;
                int lastDigit = isbn.charAt(12) - '0';

                if (checkDigit == lastDigit) {
                    System.out.println("Valid ISBN");
                } else {
                    System.out.println("Invalid ISBN");
                }
            
            }
        }
    }
}
