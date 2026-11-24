import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter a number (-1 to stop): ");
            double number = input.nextDouble();

            if (number == -1) {
                break;
            }

            sum = sum + number;
            count = count + 1;

            double average = sum / count;

            System.out.println("Running average: " + average);
        }

        input.close();
    }
}
