package basics;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly rate?");
        double rate = scanner.nextDouble();

        scanner.close();
        double grossPay = hours * rate;
        System.out.println("Your gross pay is: $" + grossPay);
    }
}
