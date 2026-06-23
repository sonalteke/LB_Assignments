package Assignment19;
/* Write a program to check the number is divisible by 5 and 11*/
public class Program3 {
    void checkDivisible(int num){
        if (num % 5 == 0 && num % 11 == 0) {

            System.out.println(num +" is divisible by 5 and 11");
        }else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
    }
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.checkDivisible(550);
    }
}
