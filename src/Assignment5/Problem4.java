package Assignment5;

import java.util.Scanner;

//Write a program which accepts N number from user and print all odd numbers upto N
public class Problem4 {

    public static void printOddNumbers(int number){
        for (int i=1; i<=number; i++){
            if (i % 2 != 0){
                System.out.print(" " +i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        printOddNumbers(number);
        scanner.close();
    }
}
