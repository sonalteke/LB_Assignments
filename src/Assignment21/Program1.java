package Assignment21;
/* Write a program to calculate the product of digits of numbers*/
public class Program1 {
    void calculateProductNumber(int num){
        int product = 1;
        while (num > 0 ){
            int digit = num % 10;
            product = product * digit;
            num = num/10;
        }
        System.out.println("Product of digits is: "+product);
    }

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        program1.calculateProductNumber(234);
    }
}
