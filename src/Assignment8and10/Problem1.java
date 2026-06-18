package Assignment8and10;
/* Write a program which accept radius of circle from user and calculate its area.
Consider value of PI as 3.14. (Area = PI * Radius * Radius)
Input :
        5.3
Output : 88.2026 */

import java.util.Scanner;

public class Problem1 {

    public static void calculateArea(float radius){
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println("Area is : " +area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for radius of circle:");
        float radius = scanner.nextFloat();
        calculateArea(radius);
        scanner.close();
    }
}
