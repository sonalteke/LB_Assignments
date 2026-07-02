package Assignment31;

import java.util.Scanner;

/* Write a program which accept string from user and display it in reverse order */
public class Program5 {
    public static void displayReverse(String str){
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sobj.nextLine();

        displayReverse(str);

        sobj.close();
    }
}
