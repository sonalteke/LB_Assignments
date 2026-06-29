package Assignment24;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 5
Output :
4   4   4   4   4
3   3   3   3   3
2   2   2   2   2
1   1   1   1   1
*/
public class Program4 {
    public static void displayPattern(int iRow, int iCol)
    {
        int i =0, j=0;
        int iCount = 0;

        for (i=1, iCount = iRow; i<=iRow; i++, iCount--){
            for (j=1; j<= iCol; j++){
                System.out.print(iCount+"\t");
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
