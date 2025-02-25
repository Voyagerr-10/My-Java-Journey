// Program to reverse and display the digits of a number

import java.util.Scanner;

public class q038_ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        int result = reverseDigits(num);
        System.out.print(result);
//        // Handling trailing zero
//        while (num%10==0 && num!=0) {
//            num/=10;
//        }
//
//        // Computing and displaying digits in reverse order
//        while (num > 0) {
//            System.out.print( num % 10 + " ");
//            num/=10;
//        }
    }

    public static int reverseDigits(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
