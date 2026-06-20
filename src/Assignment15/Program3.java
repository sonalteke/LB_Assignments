package Assignment15;

import java.util.Scanner;

/* Accept n numbers from users and accept one another number as No, return index
 of last occurrence of that No.*/

public class Program3 {
    public static int firstOccurrence(int arr[], int no) {

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == no){
                return i;//Return first index where No is found
            }
        }
        return -1; // No not found
    }
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elements:");
        for (int i = 0; i<iSize; i++){
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter element to search: ");
        int iNo = sobj.nextInt();

        int result = firstOccurrence(arr, iNo);

        if (result != -1) {
            System.out.println("Index of number is: "+result);

        }else {
            System.out.println("Number is not present in the array");

        }
        sobj.close();
    }
}
