package Assignment6;

import java.util.Scanner;

//Write a program to find factorial of the given numbers and display it's multiplication
public class Problem3 {

     public static void displayFactorialMultiplication(int number) {
         long factorial = 1;

         for (int i = 1; i <= Math.abs(number); i++) {
             factorial = factorial * i;
         }

         System.out.println("Factorial of " + number + " = " + factorial);
     }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to get Factorial: ");
        int number = scanner.nextInt();
        displayFactorialMultiplication(number);
        scanner.close();
    }
}
