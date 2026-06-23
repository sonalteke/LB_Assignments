package Assignment18;
/* Program to check the prime number */

public class Program1 {
    void checkPrime(int num) {
        int count = 0;

        for (int i=1; i <= num; i++){
            if (num % i ==0 ){
                count++;
            }
        }
        if (count == 2) {

            System.out.println(num +" is prime number");
        }else {
            System.out.println(num + " is not prime number");

        }
    }
    public static void main(String[] args) {
        Program1 program1 = new Program1();
        program1.checkPrime(11);
    }
}
