// Program to apply bitwise AND on two numbers

import java.util.Scanner;

public class q22_BitwiseAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise AND operator-----");

        // Take input as integers
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        sc.close();

        // Perform Bitwise AND
        int c = a & b ;

        // Display result
        System.out.print(a+" & "+b+" = "+c);
    }
}
