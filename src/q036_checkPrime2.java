// Program to check whether given number is PRIME or not

import java.util.Scanner;

public class q036_checkPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 1 ) {
            System.out.print(num+ " is Not Prime"); // Handling 0, 1, and negatives (not prime)
        }
        else if(isPrime(num)) {
            System.out.print(num+" is Prime");
        }
        else {
            System.out.print(num+" is Not Prime");
        }

    }

    public static boolean isPrime (int n) {
        if (n % 2 == 0 && n != 2) {
            return false; // Even numbers > 2 are not prime
        }

        // Checking for other numbers
        for ( int i = 3; i*i<=n; i+=2) {
            if (n%i==0) {
                return false; // Found a divisor, exit loop.
            }
        }
        return true;
    }
}

// WHY NEGATIVE NUMBERS ARE NOT PRIME :
//A prime number must have exactly two positive divisors: 1 and itself.
//For example, 5 is prime because it is only divisible by 1 and 5.
//But -5 has the divisors: 1, -1, 5, and -5, which are more than two.