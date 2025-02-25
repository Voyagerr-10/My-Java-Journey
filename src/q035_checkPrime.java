// Program to check whether given number is PRIME or not

import java.util.Scanner;

public class q035_checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        // Calculate and display result
        isPrime(num);
    }

    public static void isPrime(int n) {
        int flag = 0;
        for(int i=2; i<=(n/2);i++) {
            if(n%i==0) {
                System.out.print("not prime");
                flag = 1;
                break;
            }
        }
        if(flag==0) {
            System.out.print("prime");
        }
    }

}
