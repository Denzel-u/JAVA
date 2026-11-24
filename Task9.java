import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        for (int first = 1; first <= 9; first++) {
            for (int second = first + 1; second <= 9; second++) {
                for (int third = second + 1; third <= 9; third++) {

                    if (first + second + third == target) {
                        System.out.println(first + " + " + second + " + " + third);
                    }
                }
            }
        }
    }
}
