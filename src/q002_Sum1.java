// Program to print sum of two numbers

import java.util.Scanner;

public class q002_Sum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the User
        System.out.print("Enter 1st no. : ");
        int first = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int second = sc.nextInt();
        sc.close();

        int sum=first+second; //adding values and storing in an empty variable 'sum'
        System.out.print("Sum = "+sum);
    }
}
