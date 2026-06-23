package Assignment17;

/* Write a program to find the maximum of two numbers */

import java.util.Scanner;

public class Program3 {
    void findMax(int num1, int num2){
        if (num1 > num2){
            System.out.println("Maximum number is: "+num1);
        }
        else {
            System.out.println("Maximum number is : "+num2);
        }
    }
    public static void main(String[] args) {

        Program3 program3 = new Program3();
        program3.findMax(20,25);
    }
}
