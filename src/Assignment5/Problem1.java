package Assignment5;

import java.util.Scanner;

//Write a program which accept number from user and print that number of $ & * on screen.
public class Problem1 {
    public static void pattern(int number){

        for (int i=1; i<=Math.abs(number); i++){
            System.out.print(" & " + " * ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        pattern(number);

        scanner.close();
    }

}
