// Program to assign age group to a person

import java.util.Scanner;

public class q21_AgeGrouping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take age as input
        System.out.print("Please enter you Age : ");
        int age = sc.nextInt();
        sc.close();

        // Assigning age group
        if(age>=60&&age<120) {
            System.out.print("Your Age Group is : SENIOR");
        }
        else if(age>=20&&age<60) {
            System.out.print("Your Age Group is : ADULT");
        }
        else if (age>=13&&age<20) {
            System.out.print("Your Age Group is : TEEN");
        }
        else {
            System.out.print("Your Age Group is : CHILD");
        }
    }
}
