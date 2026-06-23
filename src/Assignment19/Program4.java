package Assignment19;
/* Write a program to print each digit of a number separately*/
public class Program4 {
    void printSeparateDigit(int num){
        String str = Integer.toString(num);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.printSeparateDigit(4356);
    }
}
