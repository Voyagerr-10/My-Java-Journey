// Program to find the area of a triangle

import java.util.Scanner;

public class q011_TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter Base : ");
        double b = sc.nextDouble();
        System.out.print("Enter Height : ");
        double h = sc.nextDouble();
        sc.close();

        // Compute and print area
        double a = 0.5f*b*h;
        System.out.println("Area : "+ a);
    }
}