package Assignment25;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 4
Output :
1   2   3   4
2   3   4   5
3   4   5   6
4   5   6   7
*/
public class Program5 {
    public static void pattern(int iRow, int iCol){

        for (int i = 1; i<=iRow; i++){
            for (int j = 1; j<=iCol; j++){
                System.out.print((i + j - 1) + "\t");
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
