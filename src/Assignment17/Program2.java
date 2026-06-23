package Assignment17;
/* Write a program to check the number is palindrome or not */
public class Program2 {

    public void palindrome(int num){
        int original = num;
        int reverse = 0;

        while (num > 0){
            int digit = num% 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

    }
    public static void main(String[] args) {

        Program2 program2 = new Program2();
        program2.palindrome(121);
    }
}
