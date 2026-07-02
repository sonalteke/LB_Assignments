package Assignment29;

import java.util.Scanner;

/* Accept character from user and check whether it is small case*/
public class Program4 {

    public static boolean chkAlpha(char ch) {
        if ((ch >= 'a' && ch <= 'z')) {
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
            System.out.println("It is small case character");
        } else {
            System.out.println("It is not small case character");
        }

        sc.close();
    }
}
