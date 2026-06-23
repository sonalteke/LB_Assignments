package Assignment18;

import java.util.Scanner;

/* Write a program to print all the even numbers up to N */
public class Program2 {
    void displayEvenNumbers(int num){

        for (int i = 1; i<=num; i++){
            if (i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.displayEvenNumbers(25);
    }
}
