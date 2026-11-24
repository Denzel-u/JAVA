public class Task1 {
    public static void main(String[] args) {

        boolean found = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {

                    int number = a * 100 + b * 10 + c;
                    int sum = (a * a) + (b * b) + (c * c);

                    if (number == sum) {
                        System.out.println(number);
                        found = true;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No numbers found.");
        }
    }
}
