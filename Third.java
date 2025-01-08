import java.util.Scanner; // Import the Scanner class for user input

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Close the scanner
        scanner.close();
    }
    
}
