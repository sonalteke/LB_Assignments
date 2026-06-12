package Assignment5;

import java.util.Scanner;

//Write a program which accept number from user and print its numbers line
public class Problem3 {
    public static void printNumbers(int number){
        int boundary = Math.abs(number); // Returns the absolute (positive) value of a given number

        for (int i=-boundary; i<=boundary; i++){
            System.out.print(" " +i+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        printNumbers(number);
        scanner.close();
    }
}
