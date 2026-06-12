package Assignment7;

import java.util.Scanner;
//// Write a program to find odd factorial of given number
public class Problem4 {
    public static void displayOddFactorial(int number) {
        long result = 1;

        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) {
                result = result * i;
                System.out.println("Odd Factorials numbers are : " + i + " ");
            }

        }
        System.out.println("Odd Factorial of " + number + " = " + result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        displayOddFactorial(number);
        scanner.close();
    }
}
