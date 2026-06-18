package Assignment12;
/*  Write a program in which user accept number from user and count of
digits which are less than 6*/
import java.util.Scanner;

public class Program5 {

    public static int countTwo(int iNo) {

        int iDigit = 0;
        int iCount = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10; // Extract last digit

            if (iDigit < 6) {
                iCount++;
            }

            iNo = iNo / 10; // Remove last digit
        }

        return iCount;
    }
    public static void main(String[] args) {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        iRet = countTwo(iValue);

        System.out.println("Frequency of digits less than 6 is :" +iRet);

        sobj.close();
    }
}
