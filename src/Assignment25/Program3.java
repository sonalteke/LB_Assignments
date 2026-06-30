package Assignment25;

import java.util.Scanner;

/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 5, iCol = 5
Output :
a   b   c   d   e
1   2   3   4   5
a   b   c   d   e
1   2   3   4   5
a   b   c   d   e
*/
public class Program3 {
    public static void pattern(int iRow, int iCol){
        int i = 0, j=0;
        char ch = '\0';
        for (i = 1;i<=iRow; i++){

            if (i% 2 !=0) {
                ch = 'a';

                for (j = 1; j <= iCol; j++) {
                    System.out.print(ch + "\t");
                    ch++;
                }
            }
            else {
                for (j = 1; j <= iCol; j++) {
                    System.out.print(j + "\t");
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
