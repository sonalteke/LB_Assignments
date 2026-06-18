package Assignment9;

import java.util.Scanner;

/* Write a program which accepts number from user and return the
multiplication of all digits
 */
public class Program4 {

        public static int MultDigits(int iNo) {
            int iDigit = 0;
            int iMult = 1;

            while (iNo != 0) {
                iDigit = iNo % 10;
                iMult = iMult * iDigit;
                iNo = iNo / 10;
            }

            return iMult;
        }

        public static void main(String[] args) {
            Scanner sobj = new Scanner(System.in);

            int iValue = 0;
            int iRet = 0;

            System.out.print("Enter number : ");
            iValue = sobj.nextInt();

            iRet = MultDigits(iValue);

            System.out.println("Multiplication of digits is : " + iRet);
            sobj.close();
    }
}
