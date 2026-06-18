package Assignment11;
/* Write a program which accept range from user and display all numbers
in between that range in reverse order.*/

import java.util.Scanner;

public class Program5 {

    public static void rangeDisplayRev(int iStart, int iEnd) {

        if (iStart > iEnd) {
            System.out.println("Invalid range");
            return;
        }

        for (int iCnt = iEnd; iCnt >= iStart; iCnt--) {
            System.out.print(iCnt + " ");
        }
    }

    public static void main(String[] args) {

        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter starting point : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter ending point : ");
        iValue2 = sobj.nextInt();

        rangeDisplayRev(iValue1, iValue2);

        sobj.close();
    }
}
