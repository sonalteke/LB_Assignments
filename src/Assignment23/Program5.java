package Assignment23;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 4
Output :
1   1   1   1
2   2   2   2
3   3   3   3
4   4   4   4
*/
public class Program5 {
    public static void pattern(int iRow, int iCol){
        for (int i=1; i<=iRow; i++){
            for (int j=1; j<=iCol; j++){
                System.out.print(i+"\t");
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
