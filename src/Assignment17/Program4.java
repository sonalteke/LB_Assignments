package Assignment17;

/* Write a program to find the minimum of 3 numbers*/
public class Program4 {

    void findMin(int num1, int num2, int num3){
        int min = num1;
        if (num2 < min) {
            min = num2;
        }

        if (num3 < min){
            min = num3;
        }
        System.out.println("Minimum number is : "+min);
    }
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.findMin(100,40,50);
    }
}
