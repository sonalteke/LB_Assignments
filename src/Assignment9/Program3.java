package Assignment9;

import java.util.Scanner;

/* Write a program which accepts number from user and return the count of digits
*  in between 3 and 7 */
public class Program3 {
    public static int countRange(int iNo)
    {
        int iDigit =0;
        int iCount = 0;

        if (iNo < 0){
            iNo = -iNo;
        }

        while (iNo  !=0 ){
            iDigit = iNo %10;
            if (iDigit >= 3 && iDigit <= 7) {

                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
    public static void main(String[] args) {
        int iValue = 0;
        int iRet = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        iValue = sObj.nextInt();

        iRet = countRange(iValue);

        System.out.println("Count: "+iRet);
        sObj.close();
    }
}
