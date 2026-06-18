package Assignment11;

import java.util.Scanner;

/* Write a program which accept range from user and return addition of all even numbers
in between that range. (Range should contains positive numbers only)*/
public class Program4 {

    public static int  rangeSum(int iStart, int iEnd){
        int iSum = 0;

        if (iStart <= 0 || iEnd <= 0 || iStart > iEnd) {
            return -1;
        }

        for (int iCnt = iStart; iCnt <= iEnd; iCnt++) {
            if (iCnt % 2 == 0){
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
    public static void main(String[] args) {
        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter ending point: ");
        iValue2 = sobj.nextInt();

        iRet = rangeSum(iValue1, iValue2);

        if (iRet == -1) {
            System.out.println("Invalid range");
        } else {
            System.out.println("Addition is : " + iRet);
        }
        sobj.close();

    }
}
