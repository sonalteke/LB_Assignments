package Assignment20;
/* Write a program to find the smallest digit in the given number*/

public class Program5 {
    void findSmallest(int num){
        int smallest = 9;
        while (num > 0){
            int digit  = num % 10; // get last digit
            if (digit < smallest){
                smallest = digit;
            }
            num = num/10; // remove last digit
        }
        System.out.println("Smallest digit is : " +smallest);
    }

    public static void main(String[] args) {
        Program5 program5 = new Program5();
        program5.findSmallest(45812);
    }
}
