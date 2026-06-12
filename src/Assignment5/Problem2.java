package Assignment5;

//Write a program which accept number from user and print numbers till that number
import java.util.Scanner;

public class Problem2 {
    public static void display(int number){
        for (int i=0; i<number; i++){
           int length = i+1;
            System.out.print(" " + length + " ");
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
