package Assignment16;
/* Accept N numbers from users and display the difference between largest and
smallest numbers */
import java.util.Scanner;

public class Program3 {

    public static int difference(int arr[]){
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i<arr.length; i++){
            if (arr[i]> max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return max-min;
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

        int result = difference(arr);
        System.out.println("difference between largest and smallest number is: "+result);
    }
}
