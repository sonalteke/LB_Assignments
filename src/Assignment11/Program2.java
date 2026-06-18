package Assignment11;

import java.util.Scanner;

/* Write a program which accepts range from user and display all the even
numbers in between that range */
public class Program2 {

    public static void rangeDisplay(int iStart, int iEnd){
        int iCount = 0;

        if (iStart > iEnd){
            System.out.println("Invalid range");
            System.out.println("Please enter the valid range");
            return;
        }
        System.out.println("Numbers are: ");
        for (iCount = iStart; iCount <= iEnd; iCount++)
            if (iCount % 2 == 0){
                System.out.println(+iCount+"\t");
            }
    }

    public static void main(String[] args) {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter starting point: ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter ending point: ");
        iValue2 = sobj.nextInt();

        rangeDisplay(iValue1, iValue2);
        sobj.close();

    }
}
