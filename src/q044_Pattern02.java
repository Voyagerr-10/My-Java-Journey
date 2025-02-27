// Program that prints Reverse Right hand Pyramid pattern

import java.util.Scanner;

public class q044_Pattern02 {
    public static void main(String[] args) {
        System.out.println("--------Reverse Right Hand Pyramid--------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++) {
            for(int j = i-1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}