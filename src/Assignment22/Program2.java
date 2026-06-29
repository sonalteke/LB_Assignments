package Assignment22;

import java.util.Scanner;

/* Accept the below input from user and display the output
Input = 5;
Output: 5   #   4   #   3   #   2   #   1   #
*/
public class Program2 {

    public static void pattern(int iNo){

        for (int i=iNo; i>=1; i--){
            System.out.print(i  +" # ");
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
