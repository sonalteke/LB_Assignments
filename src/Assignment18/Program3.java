package Assignment18;
/* Write a program to print all odd numbers up to N*/
public class Program3 {

    void printOddNumbers(int num){
        for (int i=1; i <= num; i++){
            if (i % 2 !=0 ){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.printOddNumbers(20);

    }
}
