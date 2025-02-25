// Program to find the Least Common Multiple (LCM) of two numbers

import java.util.Scanner;

public class q33_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the First Number: ");
        int m = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int n = sc.nextInt();
        sc.close();

        // Compute and display LCM
        int lcm = findLCM(m, n);
        System.out.println("The LCM of " + m + " and " + n + " is " + lcm);
    }

    public static int findLCM(int m, int n) {
        int step = Math.max(m, n); // Start with the larger number
        int lcm;

        // Increment in steps of the larger number
        for (lcm = step; lcm <= (m * n); lcm += step) {
            if (lcm % m == 0 && lcm % n == 0) {
                break; // Found LCM, exit loop
            }
        }
        return lcm; // Return the last value stored in lcm
    }
}

