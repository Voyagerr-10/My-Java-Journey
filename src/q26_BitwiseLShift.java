// Program to perform Bitwise Left Shift on a number

import java.util.Scanner;

public class q26_BitwiseLShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise Left Shift operator-----");

        // Input integer
        System.out.print("Enter your no. : ");
        int a = sc.nextInt();

        // Input number of bits to shift
        System.out.print("Enter Shift count : ");
        int b = sc.nextInt();
        sc.close();

        // Perform Bitwise Left Shift
        int c = a<<b;

        // Display result
        System.out.print(a+"<<"+b+" = "+c);
    }
}
