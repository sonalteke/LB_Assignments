package Assignment25;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 3
Output :
1   2   3   4
5   6   7   8
9   1   2   3
4   5   6   7
*/
public class Program1 {
    public static void pattern(int iRow, int iCol){
        int iCount = 0;
        for (int i = 1; i<=iRow; i++){
            for (int j = 1; j<=iCol; j++){
                iCount++;
                System.out.print(iCount+"\t");

                if (iCount >= 9){
                    iCount = 0;
                }
            }
            System.out.println(" ");
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
