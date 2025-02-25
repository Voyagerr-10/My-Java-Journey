// Program to find if a year is leap or not

import java.util.Scanner;

public class q19_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take  year as input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();

        // Check using logical operators and print answer
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}

//        A year is a leap year if:
//        It is divisible by 400 → Always a leap year.
//        It is divisible by 100 but NOT by 400 → Not a leap year.
//        It is divisible by 4 but NOT by 100 → Leap year.
//        Otherwise, it is not a leap year.