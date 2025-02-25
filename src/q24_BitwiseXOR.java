// Program to apply bitwise XOR on two numbers

import java.util.Scanner;

public class q24_BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise XOR operator-----");

        // Take input integers
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        sc.close();

        // Perform Bitwise XOR
        int c = a ^ b ;

        // Display result
        System.out.print(a+" ^ "+b+" = "+c);
    }
}