//  Program to check if an integer is positive or negative

import java.util.Scanner;

public class q15_CheckSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------CheckSign------");

        // Take input
        System.out.print("Enter your Number : ");

        if (sc.hasNextInt()) {
            /* The hasNextInt() method in Java is used to check whether
             the next input is an integer before actually reading it. */
            int n = sc.nextInt();

            // check using if-else
            if (n>0)
            {
                System.out.println(n + " is Positive");
            }
            else if (n<0)
            {
                System.out.println(n + " is Negative");
            }
            else
            {
                System.out.println(n + " is Zero"); // Zero is neither +ve nor -ve
            }
        }
        else {
            System.out.println("Invalid input! Please enter an integer."); // Handling invalid input
        }
    sc.close();
    }
}