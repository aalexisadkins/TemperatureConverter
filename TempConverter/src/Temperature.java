import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter!");

        while (true) {
            System.out.println();
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Temperature in Celcius: " + temperature.toCelcius(fahrenheit));
            } else if (choice == 2) {
                System.out.println("Enter temperature in Celcius: ");
                double celcius = scanner.nextDouble();
                System.out.println("Temperature in Fahrenheit: " + temperature.toFahrenheit(celcius));
            } else if (choice == 3) {
                System.out.println("Thank you for using Temperature Converter!");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }

    public double toCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toFahrenheit(double celcius) {
        return celcius * 9 / 5 + 32;
    }
}
