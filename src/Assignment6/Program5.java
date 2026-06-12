package Assignment6;

//Write a program which accept number and display its table in reverse order

import java.util.Scanner;

public class Program5 {
    public static void displayTableInReverse(int number){
        for (int i=10; i>=1; i--){
            int table = number *i;
            System.out.print(" "+ table +" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        displayTableInReverse(number);
        scanner.close();
    }
}
