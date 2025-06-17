package CovertTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("\n=====Menu=====");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + ConvertTemperature.fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + ConvertTemperature.celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("Exiting program!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again!");
                    return;
            }
        } while (choice != 0);
    }
}
