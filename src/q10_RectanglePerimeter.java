// Program to compute the perimeter of a rectangle

import java.util.Scanner;

public class q10_RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter Length : ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth : ");
        double b = sc.nextDouble();
        sc.close();

        // Calculating and printing perimeter
        double p = 2*(l+b);
        System.out.println("Perimenter : "+p);
    }
}
