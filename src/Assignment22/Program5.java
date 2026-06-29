package Assignment22;

/* Accept the below input from user and display the output
Input = 8;
Output: 2   4  6  8  10  12  14  16
*/

import java.util.Scanner;

public class Program5 {
    public static void pattern(int iNo){

        for (int i=1; i<=iNo; i++){
            System.out.print(" "+i * 2+" ");
        }
    }
    public static void main(String[] args) {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        iValue = sobj.nextInt();

        pattern(iValue);

        sobj.close();

    }
}
