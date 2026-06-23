package Assignment17;
/* Write a program to find the sum of the digits of numbers*/
public class Program1 {

    public int sumOfDigits(int iNo){
        int sumOfDigits = 0;

        while (iNo != 0){
                sumOfDigits = sumOfDigits + (iNo % 10);
                iNo = iNo / 10;
        }
        System.out.println("Sum of digits: "+sumOfDigits);
        return sumOfDigits;
    }
    public static void main(String[] args) {
        Program1 pobj = new Program1();
        pobj.sumOfDigits(1234);
    }
}
