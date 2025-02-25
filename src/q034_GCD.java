// Program to find Greatest Common Divisor (GCD) of two numbers

import java.util.Scanner;

public class q034_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter First Number : ");
        int m = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n = sc.nextInt();
        sc.close();

        // Calculate and display GCD
        int gcd = findGCD(m, n);
        System.out.print("The GCD of "+m+" and "+n+" is "+gcd);
    }

    public static int findGCD(int m, int n) {
        int gcd;
        int step = Math.min(m, n); // Start with the smaller number

        for(gcd=step; gcd>=1; gcd--) {
            if(m%gcd==0 && n%gcd==0) {
                break; // Found GCD, exit loop
            }
        }
        return gcd; // Return the last value stored in gcd
    }

//    public static int findGCD(int m, int n) {
//        while (n != 0) { // Loop until remainder becomes 0
//            int temp = n;
//            n = m % n;
//            m = temp;
//        }
//        return m; // GCD is stored in m
//    }

}
