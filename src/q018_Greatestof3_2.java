// Program to find the greatest of three numbers

import java.util.Scanner;

public class q018_Greatestof3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter the three numbers --");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        // Check using if-else
        if (a >= b && a >= c) {
            System.out.print(a + " is the Greatest.");
        }
        else if (b >= c ) {
            System.out.print(b + " is the Greatest.");
        }
        else {
            System.out.print(c + " is the Greatest.");
        }
    }
}
