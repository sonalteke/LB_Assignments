package Assignment14;

import java.util.Scanner;

/* Accept N numbers from user check whether that numbers contain 11 in it or not.*/
public class Program3 {

    public static boolean checkEleven(int arr[]){
        for (int num : arr){
            if (num ==  11){
                return true;
            }
        }
        return false;
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

        boolean result = checkEleven(arr);
        if (result){
            System.out.println("11 is present in the array");
        }else {
            System.out.println("11 is not present in the array");
        }
        sobj.close();

    }
}
