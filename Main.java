import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Currency Converter =====");
            System.out.println("1. INR to USD");
            System.out.println("2. INR to EUR");
            System.out.println("3. USD to INR");
            System.out.println("4. EUR to INR");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount in INR: ");
                    double inrToUsd = sc.nextDouble();
                    System.out.printf("USD = %.2f%n", inrToUsd * 0.012);
                    break;

                case 2:
                    System.out.print("Enter amount in INR: ");
                    double inrToEur = sc.nextDouble();
                    System.out.printf("EUR = %.2f%n", inrToEur * 0.011);
                    break;

                case 3:
                    System.out.print("Enter amount in USD: ");
                    double usdToInr = sc.nextDouble();
                    System.out.printf("INR = %.2f%n", usdToInr * 83.0);
                    break;

                case 4:
                    System.out.print("Enter amount in EUR: ");
                    double eurToInr = sc.nextDouble();
                    System.out.printf("INR = %.2f%n", eurToInr * 90.0);
                    break;

                case 5:
                    System.out.println("Thank you for using Currency Converter.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}