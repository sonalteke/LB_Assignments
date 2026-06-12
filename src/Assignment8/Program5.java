package Assignment8;

/* Write a program which accept area in square feet and convert it into square
meter. (1 square feet = 0.0929 Square meter)
Input : 5
Output : 0.464515 */

import java.util.Scanner;

public class Program5 {

    public static void squareFeetToSquareMeter(double area){
        double squareMeterValue = area * 0.0929;

        System.out.println(" Square feet to Sqaure meter value of " + area + " = " +squareMeterValue);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter area (Square feet): ");
        double area = scanner.nextDouble();
        squareFeetToSquareMeter(area);
        scanner.close();
    }
}
