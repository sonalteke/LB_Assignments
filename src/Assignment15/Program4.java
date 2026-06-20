package Assignment15;

import java.util.Scanner;

/* Accept N numbers from user and accept Range, Display all the elements from
that range. */
public class Program4 {

    public static void displayRange(int arr[],int iValue1, int iValue2){
        System.out.println("Elements in the range " + iValue1 + " to " + iValue2 + " are:");

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= iValue1 && num <= iValue2){
                System.out.println(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter the elements: ");
        for (int i=0; i<iSize; i++){
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter first value: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second value: ");
        int iValue2 = sobj.nextInt();


        displayRange(arr, iValue1, iValue2);
        sobj.close();
    }
}
