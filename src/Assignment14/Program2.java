package Assignment14;
/* Accept N numbers from user and return difference between frequency of even
number and odd numbers.*/

import java.util.Scanner;

public class Program2 {
    public static int checkOddandEvenDiff(int arr[]){
        int evenCount =0 ;
        int oddCount = 0;
        for (int num : arr){
            if (num%2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return evenCount - oddCount;
    }
    public static void main(String[] args) {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        iSize = sobj.nextInt();

        int arr[] = new int[iSize];

        System.out.println("Enter "+iSize+" elements: ");
        for (int i =0 ; i <iSize; i++){
            arr[i] = sobj.nextInt();
        }

        int result = checkOddandEvenDiff(arr);
        System.out.println("frequency of even numbers is: "+result);
        sobj.close();

    }
}
