package Assignment6;

import java.util.Scanner;

//Write a program which accept number and display its table
public class Problem4 {

    public static void displayTable(int number){
        for (int i=1; i<=10; i++){
            int table = number *i;
            System.out.print(" "+ table +" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        displayTable(number);
        scanner.close();
    }
}
