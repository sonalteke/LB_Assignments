package Assignment20;
/* Write a program to check the number is perfect or not*/
public class Program3 {
    void checkPerfect(int num){
        int sum = 0;
        for (int i=1; i < num; i++){
            if (num % i ==0 ){
                sum = sum + i;
            }
        }
        if (sum == num){
            System.out.println(num+ " is a perfect number");
        } else {
            System.out.println(num+ " is not a perfect number");
        }
    }

    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.checkPerfect(11);
    }
}
