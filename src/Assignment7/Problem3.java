package Assignment7;

import java.util.Scanner;
// Write a program to find even factorial of given number
public class Problem3 {

    public static void displayEvenFactorial(int number){
            long result = 1;

            for (int i = Math.abs(number); i >= 2; i--) {
                if (i % 2 == 0){
                    result = result * i;
                    System.out.println("Even Factorials numbers are : "+ i + " ");
                }

            }

            System.out.println("Even Factorial of " + number + " = " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        displayEvenFactorial(number);
        scanner.close();
    }
}
