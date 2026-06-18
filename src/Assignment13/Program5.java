package Assignment13;
/* Accept N numbers from user and display all such elements
which are multiplies of 11 */

import java.util.Scanner;

public class Program5 {
    public static void display(int arr[]) {
        System.out.println("Numbers multiplies of 11 : ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] %11 ==0) {
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
