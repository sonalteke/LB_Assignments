package Assignment30;
/* Accept character from user. If it is capital then display all the characters
 from the input characters till Z. If input character is small then print all
 the characters in reverse order till a. In other cases return directly.*/

import java.util.Scanner;

public class Program3 {
    public static void display(char ch){
        if (ch >= 'A' && ch <= 'Z') {
            // Print from input character to Z
            for (char c = ch; c <= 'Z'; c++) {
                System.out.print(c + " ");
            }
        }
        else if (ch >= 'a' && ch <= 'z') {
            // Print in reverse order from input character to a
            for (char c = ch; c >= 'a'; c--) {
                System.out.print(c + " ");
            }
        } else {
            // Display character as it is
            System.out.println("Character remains the same: " + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        display(ch);
        sc.close();
    }
}
