package loops;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int hours = scanner.nextInt();

        while (hours > maxHours || hours < 1) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hours = scanner.nextInt();
        }

        System.out.println("What is your hourly rate?");
        double grossPay = hours * rate;
        System.out.println("Your gross pay is: $" + grossPay);
        scanner.close();
    }
}
