package Assignment18;
/* Write a program to find the sum of even and odd digits separately in numbers */
public class Program4 {
    void sumEvenOddDigits(int num){
        int evenSum = 0;
        int oddSum = 0;
        while (num > 0){
            int digit = num%10;
            if (digit % 2 == 0){
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }
            num = num / 10;
        }
        System.out.println("Sum of Even digits : "+evenSum);
        System.out.println("Sum of Odd digits : "+oddSum);

    }
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.sumEvenOddDigits(12345);
    }
}
