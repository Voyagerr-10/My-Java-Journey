// Program to find Simple Interest

import java.util.Scanner;

public class q012_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Simple Interest Calculator-----");

        // Take input
        System.out.println("Please Enter Your Details below :-");
        System.out.print("Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Rate of Interest : ");
        double r = sc.nextDouble();
        System.out.print("Time : ");
        int t = sc.nextInt();
        sc.close();

        // Calculate SI using formula
        double si = p*r*t/100f;

        // Print result
        System.out.println("Simple Interest = "+si);
    }
}
