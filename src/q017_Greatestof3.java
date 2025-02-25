// Program to find the greatest of three numbers

import java.util.Scanner;

public class q017_Greatestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter the three numbers --");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int greatest = a; // Taking 'a' as greatest

        // checking for b
        if (b > greatest) {
            greatest = b;
        }

        // checking for c
        if (c > greatest) {
            greatest = c;
        }

        // Printing the final value of greatest
        System.out.println(greatest + " is the Greatest");
    }
}
