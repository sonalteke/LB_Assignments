package Assignment23;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 3, iCol = 5
Output :
5   4   3   2   1
5   4   3   2   1
5   4   3   2   1
*/
public class Program3 {
    public static void pattern(int iRow, int iCol){
        for (int i=iRow; i>=1; i--){
            for (int j=iCol; j>=1; j--){
                System.out.print(j+"\t");
            }
            System.out.println(" ");
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

        pattern(iValue1, iValue2);

        sobj.close();
    }
}
