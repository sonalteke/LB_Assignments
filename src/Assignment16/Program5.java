package Assignment16;
/*Accept N numbers from user and display summation of digits of each number */
import java.util.Scanner;

public class Program5 {

    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

    // Function to display digit sum of each array element
    public static void digitsSum(int arr[]) {
        System.out.println("Sum of digits of each number:");

        for (int i = 0; i < arr.length; i++) {
            int result = digitSum(arr[i]);
            System.out.println(arr[i] + " -> " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter elements:");
        for (int i = 0; i < iSize; i++) {
            arr[i] = sobj.nextInt();
        }

        digitsSum(arr);

        sobj.close();
    }
}