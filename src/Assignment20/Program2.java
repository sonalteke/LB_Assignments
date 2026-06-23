package Assignment20;
/* Write a program print numbers from N down to 1 in reverse order*/
public class Program2 {
    void printReverse(int num){
        for (int i=num; i>=1; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.printReverse(8);
    }
}
