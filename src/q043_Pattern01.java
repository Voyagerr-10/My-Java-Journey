// Program that prints Right hand Pyramid pattern

import java.util.Scanner;

public class q043_Pattern01 {
    public static void main(String[] args) {
        System.out.println("--------Right Hand Pyramid--------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++) {
            for(int j = n-i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
// Logic : i prints new line while j prints new star on same line
// when j is n-i, it executes from  smaller to  larger number of times
// as the gap between n and j keeps increasing
// so first its n-1 so execute omce then j becomes n and condition gets false
// then n-2 so two times and so on

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) { // More intuitive condition
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
// Logic : gap between j and i gradually increases
    }
}
