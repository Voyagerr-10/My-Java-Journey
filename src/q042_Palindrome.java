// Program to verify if a number is palindrome

import java.util.Scanner;

public class q042_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        int reversed = reverseNumber(num);
        if (isPalindrome(num, reversed)) {
            System.out.print(num + " is a Palindrome.");
        } else {
            System.out.print(num + " is not a Palindrome.");
        }
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num, int reversed) {
        return num == reversed;
    }
}
