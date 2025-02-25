// Program to perform Bitwise Right Shift on a number

import java.util.Scanner;

public class q027_BitwiseRShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise Right Shift operator-----");

        // Take integer input
        System.out.print("Enter your no. : ");
        int a = sc.nextInt();

        // Input number of bits to shift
        System.out.print("Enter Shift count : ");
        int b = sc.nextInt();
        sc.close();

        // Perform Bitwise Right Shift
        int c = a>>b;

        // Print integer result
        System.out.print(a+">>"+b+" = "+c);
    }
}

