package Assignment14;

import java.util.Scanner;

/*  Accept N number from user and return frequency of 11 from it*/
public class Program4 {
    public static int checkElevenFrequency(int arr[]){
        int count = 0;
        for (int num : arr){
            if (num ==  11){
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

        int result = checkElevenFrequency(arr);
        System.out.println("Frequency of 11 is :" +result);
        sobj.close();

    }
}
