package Assignment14;

import java.util.Scanner;

/* Accept n numbers from users and accept one another number as No, return frequency
* of No from it.*/
public class Program5 {
    public static int checkNoFrequency(int arr[], int no){
        int count = 0;
        for (int num : arr){
            if (num ==  no){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter the elements to search:");
        int no =sobj.nextInt();

        int result = checkNoFrequency(arr, no);
        System.out.println("No of elements :" +result);
        sobj.close();

    }
}
