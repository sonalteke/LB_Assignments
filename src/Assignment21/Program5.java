package Assignment21;
/* Write a program to print all the numbers 1 to N that are divisible by both
* 2 and 3 */
public class Program5 {
    void printDivisibleBy3and5(int num){
        for (int i=1; i<=num ;i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Program5 program5 = new Program5();
        program5.printDivisibleBy3and5(30);
    }
}
