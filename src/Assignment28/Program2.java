package Assignment28;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 5, iCol = 5
Output :
*   *   *   #
*   *   #   @
*   #   @   @
#   @   @   @

*/
public class Program2 {
    public static void pattern(int iRow, int iCol) {
        for (int i = 1; i <= iRow; i++) {
            for (int j = 1; j <= iCol; j++) {
                if ((i + j) < (iCol + 1)) {
                    System.out.print("*\t");
                } else if ((i + j) == (iCol + 1)) {
                    System.out.print("#\t");
                } else {
                    System.out.print("@\t");
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
