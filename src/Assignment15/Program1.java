package Assignment15;

import java.util.Scanner;

/* Accept n numbers from users and accept one another number as No, return frequency
 of No from it.*/
public class Program1 {

    public static int checkFrequency(int arr[], int no){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num  == no){
                count++;
            }
        }
        return count;
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

        int checkFrequency = checkFrequency(arr, iNo);

        System.out.println("frequency of number is: "+checkFrequency);
        sobj.close();
    }
}
