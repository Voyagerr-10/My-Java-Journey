// Program to swap two values

import java.util.Scanner;

public class q6_Swap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter First Value A : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value B : ");
        int b = sc.nextInt();
        System.out.println("A = " + a + "\nB = " + b);
        sc.close();

        // Swapping using multiplication and division
        a = a * b;
        b = a / b;
        a = a / b;

        // Displaying results
        System.out.println("Swapping...");
        System.out.println("A = " + a + "\nB = " + b);
    }
}