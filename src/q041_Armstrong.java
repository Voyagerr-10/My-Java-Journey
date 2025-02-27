// Program to check if a number is an Armstrong number

import java.util.Scanner;

public class q041_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();

        int count = countDigits(num);
        double sum = powerSum(num, count);

        if (isArmstrong(num, sum)) {
            System.out.print(num + " is an Armstrong Number.");
        }
        else {
            System.out.print(num + " is not a Armstrong Number.");
        }
    }

    public static int countDigits(int n) {
        int count = 0;
        while ( n > 0) {
            n/=10;
            count++;
        }
        return count;
    }

    public static double powerSum(int n, int count) {
        double sum = 0;
        while (n > 0) {
            int digit = n % 10;
            double power = 1;
            for (int i = 1; i <= count; i++) {
                power *= digit;
            }
            sum += power;
            n /= 10;
        }
        return sum;
    }

    public static boolean isArmstrong(int num, double sum) {
        if (sum == num) {
            return true;
        }
        return false;
    }
}

// Armstrong Number is a number that is equal to
// the sum of its own digits each raised to the power of the total number of digits.