// Program to sum all odd numbers from 1 to a specified number N

import java.util.Scanner;

public class q30_SumOfAllOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Open Scanner for input
        int N = readNumber(sc); // Read input number
        sc.close();  // Close Scanner after input to prevent memory leaks

        int sum = sumOddNumbers(N);  // Get the sum of odd numbers

        // Display the result
        System.out.println("The sum of all odd numbers from 1 to " + N + " is " + sum);
    }

    // Function to read a number from the user
    public static int readNumber(Scanner sc) {  // Accept Scanner as parameter
        System.out.print("Enter your Number: ");
        return sc.nextInt();
    }

    // Function to calculate the sum of odd numbers from 1 to N
    public static int sumOddNumbers(int N) {   // Iterate through only odd numbers
        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }
        return sum; // Return the final sum
    }
}
