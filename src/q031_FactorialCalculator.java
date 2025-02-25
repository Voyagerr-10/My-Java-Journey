// Program to calculate the Factorial of a given number

import java.util.Scanner;

public class q031_FactorialCalculator {
    public static void main(String[] args) {
        int num = readNumber(); // Read input number
        long factorial = calculateFactorial(num); // Calculate factorial

        // Display the result
        System.out.println("Factorial of " + num + " is " + factorial);
    }

    // Function to read a number from the user
    public static int readNumber() {
        Scanner sc = new Scanner(System.in);  // Open Scanner
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();  // Close Scanner after input
        return n;
    }

    // Function to calculate factorial of given number n
    public static long calculateFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
