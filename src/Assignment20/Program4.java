package Assignment20;
/* Write a program to find the largest digit in the given number*/
public class Program4 {
        void findLargest(int num){
            int largest = 0;
            while (num > 0){
                int digit  = num % 10; // get last digit
                if (digit > largest){
                    largest = digit;
                }
                num = num/10; // remove last digit
            }
            System.out.println("Largest digit is : " +largest);
        }

    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.findLargest(8342);
    }
}
