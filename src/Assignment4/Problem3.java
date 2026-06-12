package Assignment4;

import java.util.Scanner;

// Write a program which accepts number from user and display all it's non-factors
public class Problem3 {

    public static void displayFactorsReverse(int num) {
        System.out.print("Factors in decreasing order: ");

        for (int i = 1; i<= num; i++) {
            if (num % i != 0) {
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
