package Assignment8;

/* Write a program which accept temperature in Fahrenheit and convert it into
celsius. (1 celsius = (Fahrenheit - 32) * (5/9))
Input : 10
Output : -12.2222 (10 - 32) * (5/9) */

import java.util.Scanner;

public class Problem4 {
    public static void fahToCel(double temp){
        double celsius = (temp - 32) * 5/9;
        System.out.println(temp+  " in celsius is : "+ celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double temp = scanner.nextInt();
        fahToCel(temp);
        scanner.close();
    }
}
