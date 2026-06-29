package Assignment22;
/* Accept the below input from user and display the output
Input = 5;
Output: A   B   C   D   E
*/

import java.util.Scanner;

public class Program1 {

    public static void pattern(int iNo){
        char ch = 'A';
        for (int i=0; i<iNo; i++, ch++){
            System.out.print(ch +" ");
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
