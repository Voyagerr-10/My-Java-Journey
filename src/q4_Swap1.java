// Program to swap  two values

import java.util.Scanner;

public class q4_Swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter First Value A : ");
        int A = sc.nextInt();
        System.out.print("Enter Second Value B : ");
        int B = sc.nextInt();
        sc.close();

        // displaying entered values
        System.out.println("A = "+A+"\nB = "+B);

        //Swapping with a temporary variable temp
        int temp = A;
        A = B;
        B = temp;

        // displaying results
        System.out.println("Swapping...");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
    }
}
