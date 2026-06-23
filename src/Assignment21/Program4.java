package Assignment21;
/* Write a program to count total number of factors of given number*/

public class Program4 {
    void countFactors(int num){
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println("Total number of factors = " + count);
    }
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.countFactors(12);
    }
}
