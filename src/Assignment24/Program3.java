package Assignment24;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3, iCol = 5
Output :
A   A   A   A   A
B   B   B   B   B
C   C   C   C   C
*/
public class Program3 {
    public static void displayPattern(int iRow, int iCol)
    {
        int i =0, j=0;
        char ch = '\0';
        for (i=1, ch= 65; i<=iRow; i++,ch++){
            for (j=1; j<= iCol; j++) {
                System.out.print(ch + "\t");
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
