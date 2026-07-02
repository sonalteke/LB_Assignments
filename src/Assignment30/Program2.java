package Assignment30;

/* Accept character from user. If character is small display its
corresponding capital character, and if it small then display its corresponding
capital. In other cases display as it is. */

import java.util.Scanner;

public class Program2 {

    public static void display(char ch){
        if (ch >= 'a' && ch <= 'z') {
            // Convert lowercase to uppercase
            ch = (char)(ch - 32);
            System.out.println("Converted character: " + ch);
        }
        else if (ch >= 'A' && ch <= 'Z') {
            // Convert uppercase to lowercase
            ch = (char)(ch + 32);
            System.out.println("Converted character: " + ch);
        }
        else {
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
