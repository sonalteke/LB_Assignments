package Assignment20;
/* Write a program to find the sum of all even numbers up to N*/
public class Program1 {
    void sumOfEvenNumbers(int num){
        int sum = 0;
        for (int i=2; i<=num; i=i+2){

            sum = sum + i;
        }
        System.out.println("Sum of all even numbers up to " +num+ " is : "+sum);
    }

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        program1.sumOfEvenNumbers(10);
    }
}
