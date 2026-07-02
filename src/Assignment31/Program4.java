package Assignment31;
/* Write a program which accept a string from user and check whether its contains
vowels or not(a,e,i,o,u) */

import java.util.Scanner;

public class Program4 {
    public static void checkVowels(String str){
        boolean found=false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The string contains vowels.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }

    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sobj.nextLine();

        checkVowels(str);

        sobj.close();

    }
}
