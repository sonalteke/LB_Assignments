package Assignment19;
/* Write a program to calculate a power of a number using loops*/
public class Program5 {
    void power(int base, int exp){
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to power " + exp + " is: " + result);
    }
    public static void main(String[] args) {
        Program5  program5 = new Program5();
        program5.power(2,3 );

    }

}
