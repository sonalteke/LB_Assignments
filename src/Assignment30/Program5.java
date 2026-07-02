package Assignment30;

import java.util.Scanner;

/* Accept character from user and display its ASCII value in decimal, octal and
 hexadecimal format
*/
public class Program5 {

    public static void display(char ch){
        int ascii = (int) ch;

        System.out.println("Character : " + ch);
        System.out.println("ASCII Value (Decimal)     : " + ascii);
        System.out.println("ASCII Value (Octal)       : " + "0" + Integer.toOctalString(ascii));
        System.out.println("ASCII Value (Hexadecimal) : " +"0X"+ Integer.toHexString(ascii).toUpperCase());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        display(ch);
    }
}
