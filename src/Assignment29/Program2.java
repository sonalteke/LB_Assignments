package Assignment29;

import java.util.Scanner;

/* Accept character from user and check whether it is capital or not
(A-Z)*/
public class Program2 {

    public static boolean chkAlpha(char ch) {
        if ((ch >= 'A' && ch <= 'Z')) {
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
            System.out.println("It is capital letter");
        } else {
            System.out.println("It is not capital letter");
        }

        sc.close();
    }
}
