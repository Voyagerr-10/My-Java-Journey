// Check if integer is an odd or even number

import java.util.Scanner;

public class q16_OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();

        // check using if-else
        if(n == 0) {
            System.out.print(n+" is neither EVEN NOR ODD"); // Handling zero
        }
        else if(n%2 == 0) {
            System.out.print(n+" is EVEN");
        }
        else {
            System.out.print(n+" is ODD");
        }
    }
}
