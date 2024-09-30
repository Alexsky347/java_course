package loops;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }

        scanner.close();
        System.out.println("Your total is: $" + total);
    }
    void processNestedForLoop(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i is " + i + ", j is " + j);
            }
        }
    }
    int processNestedLoop(){
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + i + j;
            }
        }
        return sum;
    }
}
