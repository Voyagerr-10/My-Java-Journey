// Program to display product of two floating integers

import java.util.Scanner;

public class q009_FloatProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking float input
        System.out.print("Enter 1st no. : ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd no. : ");
        float b = sc.nextFloat();
        sc.close();

        // Compute and display result
        System.out.println("Performing Multiplication :\nProduct (*) = " + (a * b));
    }
}
