// Program that prints the Multiplication Table for a given number

import java.util.Scanner;

public class q29_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Multiplication Table---");
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        Multiplication(num);
        sc.close();
    }

    public static void Multiplication(int num) {
        for(int i = 1 ;i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
