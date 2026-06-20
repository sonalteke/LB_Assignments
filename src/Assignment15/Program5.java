package Assignment15;

import java.util.Scanner;

/* Accept N numbers from user and return product(multiplication) of all odd elements */
public class Program5 {

    public static int  productOfOdd(int arr[]){
        int product = 1;
        boolean foundOdd = false;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num%2 != 0 ){
                product = product * num;
                foundOdd = true;
            }

        }
        if (foundOdd == false) {
            return 0; // no odd numbers found
        }
return product;
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
        int result = productOfOdd(arr);

        System.out.println("Product of odd elements is: " + result);

        sobj.close();
    }
}
