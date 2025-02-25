// Program to swap two values

import java.util.Scanner;

public class q007_Swap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter First Value A : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Value B : ");
        int b = sc.nextInt();
        System.out.println("A = " + a + "\nB = " + b);
        sc.close();

        a = (b + (b = a)) - a; // one-line trick

        // Display result
        System.out.println("Swapping...");
        System.out.println("A = " + a + "\nB = " + b);
    }
}
