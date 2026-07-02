package Assignment30;

import java.util.Scanner;

/* Accept character from user and check whether it is special symbol or not
 (!, @, #, $, %, ^, &, *)*/
public class Program4 {

    public static void display(char ch){
        if (ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
                ch == '%' || ch == '^' || ch == '&' || ch == '*') {
            System.out.println("It is a special symbol.");
        } else {
            System.out.println("It is not a special symbol.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        display(ch);
    }
}
