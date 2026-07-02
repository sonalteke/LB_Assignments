package Assignment29;

import java.util.Scanner;

/* Accept character from user and check whether it is digit or not
(0-9)*/
public class Program3 {

    public static boolean chkAlpha(char ch) {
        if ((ch >= '0' && ch <= '9')) {
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
            System.out.println("It is digit");
        } else {
            System.out.println("It is not digit");
        }

        sc.close();
    }
}
