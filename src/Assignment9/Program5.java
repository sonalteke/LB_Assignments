package Assignment9;

import java.util.Scanner;

/* Write a program which accept number from user and return difference between
summation of even digits and summation of odd digits.*/
public class Program5 {
    public static int CountDiff(int iNo){
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

         while (iNo != 0){
             iDigit = iNo % 10;

             if (iDigit % 2 == 0){
                 iEvenSum = iEvenSum + iDigit;
             }else {
                 iOddSum = iOddSum + iDigit;
             }
             iNo = iNo / 10;
         }

        return iEvenSum - iOddSum;
    }
    public static void main(String[] args) {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        iRet = CountDiff(iValue);

        System.out.println("Summation difference is : "+iRet);
        sobj.close();
    }
}
