package Assignment9;

import java.util.Scanner;
/* Write a program which accept number from user and return the count of even digits.*/
public class Program1 {
    public static int countEven(int iNo)
    {
                int iDigit =0;
                int iCount = 0;

                if (iNo < 0){
                    iNo = -iNo;
                }

                while (iNo  !=0 ){
                    iDigit = iNo %10;
                    if (iDigit % 2 == 0) {

                        iCount++;
                    }
                    iNo = iNo / 10;
                }
            return iCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;
        System.out.println("Enter the number: ");
        iValue = scanner.nextInt();
        iRet = countEven(iValue);
        System.out.println("Count of even digits is : " + iRet);

        scanner.close();
    }
}
