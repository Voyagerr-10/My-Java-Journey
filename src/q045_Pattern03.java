// Program that prints Left hand Pyramid pattern

import java.util.Scanner;
public class q045_Pattern03 {
    public static void main(String[] args) {
        System.out.println("--------Left Hand Pyramid--------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++) {
            for( int j = i; j < n; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}