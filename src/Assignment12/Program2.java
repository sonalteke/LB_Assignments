package Assignment12;

import java.util.Scanner;

/* Write a program which accept number from user and check whether
it contains 0 in it or not*/
public class Program2 {

        public static boolean checkZero(int iNo) {

            int iDigit = 0;

            if (iNo < 0) {
                iNo = -iNo;
            }

            // Special case for 0 itself
            if (iNo == 0) {
                return true;
            }

            while (iNo != 0) {
                iDigit = iNo % 10;

                if (iDigit == 0) {
                    return true;
                }

                iNo = iNo / 10;
            }
return false;
        }
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        if (checkZero(iValue)) {
            System.out.println("Number contains 0");
        } else {
            System.out.println("Number does not contain 0");
        }

        sobj.close();
    }
    }

