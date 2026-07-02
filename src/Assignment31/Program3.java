package Assignment31;
/* Write a program which accept string from user and return difference between frequency of
small characters and frequency of capital characters.*/

import java.util.Scanner;

public class Program3 {
    public static void displayDiff(String  str){
        int smallCount = 0;
        int capitalCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                smallCount++;
            } else if (Character.isUpperCase(ch)) {
                capitalCount++;
            }
        }

        int difference = smallCount - capitalCount;

        System.out.println("Difference is: " + difference);
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sobj.nextLine();

        displayDiff(str);
        sobj.close();
    }
}
