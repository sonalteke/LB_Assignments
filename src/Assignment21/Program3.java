package Assignment21;
/* Write a program to display all factors of given number*/
public class Program3 {
    void displayFactor(int num){
        System.out.println("Factors of " +num+ " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.displayFactor(12);
    }
}
