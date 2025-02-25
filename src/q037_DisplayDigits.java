// Program to display the digits of a given number

import java.util.Scanner;

public class q037_DisplayDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input integer
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        displayDigits(num);
    }

    // Display digits
    public static void displayDigits(int num) {
        System.out.println("The Digits are - ");
        int temp = num;
        int count = 0;
        int[] digits = new int[10]; // Assuming max 10-digit number

        while (temp > 0) {
            digits[count++] = temp % 10;
            temp /= 10;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
    }
}
