package Assignment16;
/* Accept N numbers from users and display the largest number from it */
import java.util.Scanner;

public class Program1 {

    public static int maximum(int arr[]){
        int max= arr[0]; // assume first element is largest

        for (int i = 1; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
        }
        return max;
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

        int result = maximum(arr);
        System.out.println("Largest number is: "+result);
    }
}
