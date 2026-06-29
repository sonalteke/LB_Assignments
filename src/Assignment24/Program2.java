package Assignment24;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 4
Output :
A   B   C   D
a   b   c   d
A   B   C   D
a   b   c   d
*/

import java.util.Scanner;

public class Program2 {
    public static void displayPattern(int iRow, int iCol)
    {
        for (int i = 1; i <= iRow; i++) {
            char ch;
            if (i % 2 != 0) {
                ch = 'A';
            } else {
                ch = 'a';
            }
            for (int j = 1; j <= iCol; j++) {
                System.out.print(ch + "\t");
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter the Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Columns: ");
        iValue2 = sobj.nextInt();

        displayPattern(iValue1, iValue2);

        sobj.close();
    }
}
