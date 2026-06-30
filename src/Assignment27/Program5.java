package Assignment27;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 6, iCol = 6
Output :
1   2   3   4
    2   3   4
        3   4
            4
*/
public class Program5 {
    public static void pattern(int iRow, int iCol) {
        int i = 0, j = 0;
        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iCol; j++) {
                if (i<=j){
                    System.out.print(j+"\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of Columns: ");
        iValue2 = sobj.nextInt();

        pattern(iValue1, iValue2);
    }
}