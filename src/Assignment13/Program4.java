package Assignment13;
/* Accept N numbers from user and display all such elements
which are divisible by 3 and 5 */

import java.util.Scanner;

public class Program4 {
    public static void display(int arr[]) {
        System.out.println("Numbers divisible by 3 and 5 are: ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] %3 ==0 && arr[i] % 5 == 0 ) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];
        System.out.println("Enter the elements :");
        for (int i = 0; i < iSize; i++) {
            arr[i] = sobj.nextInt();
        }

        display(arr);

        sobj.close();
    }
}
