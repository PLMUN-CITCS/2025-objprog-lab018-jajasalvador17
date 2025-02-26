import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = getIntegerInput(scanner); // Get input from the user
        String result = checkEvenOrOdd(number); // Check if even or odd

        System.out.println(result); // Display the result
        scanner.close();
    }

    // Method 1: getIntegerInput()
    public static int getIntegerInput(Scanner scanner) {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    // Method 2: checkEvenOrOdd(number)
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}