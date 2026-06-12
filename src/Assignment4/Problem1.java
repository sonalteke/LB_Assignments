package Assignment4;

import java.util.Scanner;

// Write a program which accepts number from user and display its multiplication of factors
public class Problem1 {
    public static int multFact(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                product = product * i;
            }
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int value = sc.nextInt();
        int ret = multFact(value);
        System.out.println("Multiplication of factors: " + ret);
        sc.close();
    }
}


