package Assignment29;

import java.util.Scanner;

/* Accept character from user and check whether it is alphabet or not
(A-Z or a-z)*/
public class Program1 {

    public static boolean chkAlpha(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character: ");
        char cValue = sc.next().charAt(0);

        boolean bRet = chkAlpha(cValue);

        if (bRet==true) {
            System.out.println("It is a character");
        } else {
            System.out.println("It is not a character");
        }

        sc.close();
    }
}
