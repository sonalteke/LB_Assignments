package Assignment5;

import java.util.Scanner;
//Write a program which accepts N and print first 5 multiples of N
public class Program5 {
    public static void displayMultipleOfN(int number){
        for (int i =1; i<=5; i++){
            int result = i * number;
            System.out.print(" " +result+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        displayMultipleOfN(number);

        scanner.close();
    }
}
