// Program to apply bitwise Not on a number

import java.util.Scanner;

public class q025_BitwiseNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bitwise NOT operator-----");

        // Take input
        System.out.print("Enter your no. : ");
        int a = sc.nextInt();
        sc.close();

        // Display NOT of that number
        System.out.print("~"+a+" = "+~a);
    }
}
