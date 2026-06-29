package Assignment24;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 4
Output :
A   B   C   D
A   B   C   D
A   B   C   D
A   B   C   D
*/
public class Program1 {
    public static void displayPattern(int iRow, int iCol)
    {
        int i =0, j=0;
        char ch = '\0';
        for (i=1; i<=iRow; i++){
            for (j=1, ch = 65; j<= iCol; j++, ch++){
                System.out.print(ch+"\t");
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
