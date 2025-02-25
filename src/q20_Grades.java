// Program to find the grade of a student using these rules
// A above 90%
// B above 75%
// C above 60%
// D above 30%
// E below 30%

import java.util.Scanner;

public class q20_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input marks for each subject
        System.out.println("Enter your marks for each subject (out of 100) : ");
        System.out.print("English : ");
        double e = sc.nextDouble();
        System.out.print("Hindi : ");
        double h = sc.nextDouble();
        System.out.print("Maths : ");
        double m = sc.nextDouble();
        System.out.print("Science : ");
        double s = sc.nextDouble();
        System.out.print("Computer : ");
        double c = sc.nextDouble();
        sc.close();

        // Find the total score
        double total = e+h+m+s+c;
        System.out.println("Your Total Score is : "+total);

        // Find the percentage
        double percent = (total/500)*100;
        System.out.println("Your Percentage : "+percent+" %");

        // Display grade according to the percentage
        if(percent>=90) {
            System.out.println("You've obtained an A Grade!!");
        }
        else if(percent>=75) {
            System.out.println("You've obtained a B Grade!!");
        }
        else if(percent>=60) {
            System.out.println("You've obtained a C Grade.");
        }
        else if(percent>=30) {
            System.out.println("You've obtained a D Grade.");
        }
        else {
            System.out.println("You've obtained a E Grade.");
        }
    }
}
