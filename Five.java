import java.util.Scanner; // Import the Scanner class for user input

public class CylinderVolume {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt the user to enter the height
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder using the formula: Volume = π * radius^2 * height
        double volume = Math.PI * radius * radius * height;

        // Display the result
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is " + volume);

        // Close the scanner
        scanner.close();
    }
}
