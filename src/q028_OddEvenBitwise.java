// Program to check if a number is odd or even using bitwise operators

import java.util.Scanner;

public class q028_OddEvenBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take integer input
        System.out.print("Enter your no. : ");
        int n = sc.nextInt();
        sc.close();

        //Using Bitwise AND
        if ( (n & 1) == 1 ) {
            System.out.print(n+" is ODD");
        }
        else {
            System.out.print(n+" is EVEN");
        }
    }
}
