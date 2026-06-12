package Assignment4;

import java.util.Scanner;
// Write a program which accepts number from user and display its factors in decreasing order
public class Problem2 {

    public static void displayFactorsReverse(int num) {
        System.out.print("Factors in decreasing order: ");

        for (int i = num; i >= 1; i--) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int value = sc.nextInt();

        displayFactorsReverse(value);

        sc.close();
    }
}