// Program to print Fibonacci series
// 1. Print first n Fibonacci Numbers
// 2. Print all Fibonacci Numbers up to n

import java.util.Scanner;

public class q040_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.print("Invalid input!\nOnly positive integers are allowed!");
            return;
        }

        // Giving choices to select one of the two functions
        System.out.println("Select one of the following options:");
        System.out.println("1. Print first " + num + " Fibonacci Numbers");
        System.out.println("2. Print all Fibonacci Numbers up to " + num);
        System.out.print("Enter your choice ( 1 / 2 ) : ");
        int s = sc.nextInt();
        sc.close();

        // Handling the choice entered by the user
        if (s == 1) {
            n_fibonacci(num);
        } else if (s == 2) {
            fibonacci_upto_n(num);
        } else {
            System.out.println("Invalid Choice!");
            return;
        }
    }

    public static void n_fibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("First " + n + " Fibonacci Numbers are :-");
        System.out.print(a + " ");
        if (n > 1) System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void fibonacci_upto_n(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Numbers up to " + n + " are :-");
        System.out.print(a + " ");
        while (b <= n) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
