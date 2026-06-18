package Assignment12;
/* Write a program which accepts number from user and display its digits in
reverse order*/
import java.util.Scanner;

public class Program1 {

    public static void displayDigit(int iNo){
        int iDigit = 0;
        if(iNo<0){
            iNo = -iNo;
        }
        while (iNo != 0){
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
    public static void main(String[] args) {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        displayDigit(iValue);
        sobj.close();
    }
}
