package Assignment17;
/* Write a program to print the multiplication table of number*/
public class Program5 {

    void printTable(int num){
        System.out.println("Table of "+ num + " is :");
        for (int i = 1; i<=10; i++){
            System.out.println (num * i);
        }
    }
    public static void main(String[] args) {

        Program5 program5 = new Program5();
        program5.printTable(10);
    }
}
