// Program to find Compound Interest

import java.util.Scanner;

public class q13_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Compound Interest Calculator-----");

        // Take input
        System.out.println("Please Enter Your Details below :-");
        System.out.print("Principal Amount : ");
        int p = sc.nextInt();
        System.out.print("Rate of Interest : ");
        double r = sc.nextDouble();
        System.out.print("Time : ");
        int t = sc.nextInt();
        sc.close();

        // Compute CI using formula
        double ci = p*(Math.pow(1+r/100, t));

        // Display result
        System.out.println("Compound Interest = "+ci);
    }
}