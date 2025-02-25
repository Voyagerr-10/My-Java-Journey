// Program to convert degree Fahrenheit to degree Celsius

import java.util.Scanner;

public class q014_FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter Temperature in degrees fahrenheit : ");
        float f = sc.nextFloat();

        // Compute using formula
        float c = (5/9f)*(f-32);

        // Print result
        System.out.println(f+" degrees fahrenheit = "+c+" degrees celsius.");
    }
}
