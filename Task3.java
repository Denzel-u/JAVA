public class Task3 {
    public static void main(String[] args) {

        double sales = 0;
        double commission;
        
        for (sales = 0; ; sales += 0.01) {

            if (sales <= 5000) {
                commission = sales * 0.06;
            }
            else if (sales <= 10000) {
                commission = 5000 * 0.06
                           + (sales - 5000) * 0.08;
            }
            else {
                commission = 5000 * 0.06
                           + 5000 * 0.08
                           + (sales - 10000) * 0.10;
            }

            if (5000 + commission >= 30000) {
                break;
            }
        }

        System.out.printf("Minimum sales: $%.2f%n", sales);
    }
}
