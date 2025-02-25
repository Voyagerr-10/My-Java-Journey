// Program to perform all arithmetic operations on two numbers

import java.util.Scanner;

public class q8_Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int b = sc.nextInt();
        sc.close();

        // Compute and print result
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (b - a));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : "+(b/a));
        System.out.println("Modulus : "+(b%a));
    }
}