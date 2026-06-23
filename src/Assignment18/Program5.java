package Assignment18;
/* Write a program to check the number is positive, negative or zero*/
public class Program5 {
    void checkSign(int num){
            if (num > 0){
                System.out.println(num + " is positive");
            } else if (num < 0){
                System.out.println(num + " is negative");
            }else if (num == 0 ){
                System.out.println(num+ " is zero");
            }
    }

    public static void main(String[] args) {
        Program5 program5 = new Program5();
        program5.checkSign(-8);
    }

}
