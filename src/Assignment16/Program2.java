package Assignment16;
/* Accept N numbers from users and display the smallest number from it */
import java.util.Scanner;

public class Program2 {

    public static int minimum(int arr[]){
        int min= arr[0]; // assume first element is smallest

        for (int i = 1; i<arr.length; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
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

        int result = minimum(arr);
        System.out.println("minimum number is: "+result);
    }
}
