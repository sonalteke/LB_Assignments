package Assignment6;

/* Write a program which accept number from user and if number is less than 50
then print small .if it is greater than 50 and less than 100 then print medium,
if it is greater than 100 then print large */

import java.util.Scanner;

public class Problem1 {
    public static void display(int number){
        if (number<50){
            System.out.println("Small number");
        } else if (number>50 && number<100) {
            System.out.println("Medium number");
        } else if (number>100){
            System.out.println("Large number");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        display(number);
        scanner.close();
    }
}
