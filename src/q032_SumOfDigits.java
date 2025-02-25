// A Program that computes the sum of digits of an integer

import java.util.Scanner;

public class q032_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Calculator for the Sum of Digits -----");
        System.out.print("Enter Your Number: ");
        int num = sc.nextInt();
        sc.close();  // Close scanner after input

        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits: " + sum);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {  // loop condition
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

