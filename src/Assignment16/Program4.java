package Assignment16;

import java.util.Scanner;
/* Accept N numbers from user and display all such numbers which contains 3
digit in it */
public class Program4 {

    public static boolean containsDigit3(int num) {
        while (num != 0) {
            int digit = num % 10;

            if (digit == 3) {
                return true;
            }

            num = num / 10;
        }
        return false;
    }

    public static void digits(int arr[]) {
        System.out.println("Numbers containing digit 3 are:");

        for (int i = 0; i < arr.length; i++) {
            if (containsDigit3(arr[i])) {
                System.out.print(arr[i] + " ");
            }
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

        digits(arr);

        sobj.close();
    }
}