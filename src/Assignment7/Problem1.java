package Assignment7;
/* Write a program which accept number from user and display below pattern.
Input : 5
Output : * * * * * # # # # # */

import java.util.Scanner;

public class Problem1 {

    public static void displayPattern(int number){
        for (int i=1; i<=Math.abs(number); i++){
            System.out.print(" * ");
        }
        for (int i=1; i<=Math.abs(number); i++){
            System.out.print(" # ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        displayPattern(number);
        scanner.close();
    }
}
