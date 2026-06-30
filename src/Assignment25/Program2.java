package Assignment25;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4, iCol = 5
Output :
2   4   6   8   10
1   3   5   7   9
2   4   6   8   10
1   3   5   7   9
*/
public class Program2 {
    public static void pattern(int iRow, int iCol){
        int i = 0, j=0;
        for (i = 1; i<=iRow; i++){
            for ( j = 1; j<=iCol; j++){
                if (i % 2 != 0) {          // Odd row
                    System.out.print((j * 2) + "\t");
                } else {                   // Even row
                    System.out.print((j * 2 - 1) + "\t");
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
