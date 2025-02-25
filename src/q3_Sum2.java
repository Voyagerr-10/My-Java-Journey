// Program to print sum of two numbers without the use of third variable

import java.util.Scanner;

public class q3_Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Sum = " + (a+b)); //directly printing the sum
    }
}
