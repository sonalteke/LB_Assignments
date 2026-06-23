package Assignment21;
/* Write a program to count how many even and odd numbers are present in
between 1 and N*/
public class Program2 {
    void countEvenAndOddDigits(int num){
        int evenCount = 0;
        int oddCount = 0;
        for (int i=1; i <= num; i++){
            if (i % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even count : "+evenCount);
        System.out.println("Odd Count : "+oddCount);
    }

    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.countEvenAndOddDigits(10);
    }
}
