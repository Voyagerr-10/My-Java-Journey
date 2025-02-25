// Program to apply bitwise OR on two numbers

import java.util.Scanner;

public class q23_BitwiseOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise OR operator-----");

        // Take input as integers
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        sc.close();

        // Perform Bitwise OR
        int c = a | b ;

        // Display result
        System.out.print(a+" | "+b+" = "+c);
    }
}