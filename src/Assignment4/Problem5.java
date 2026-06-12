package Assignment4;

import java.util.Scanner;

//Write a program which accept number from user and return difference between summation of all its factors and non-factors
public class Problem5 {

    public static int sumOfNonFactors(int no){
        int sum = 0;
        //Summation of non-factors
        for(int i = 1; i < no; i++)
        {
            if(no % i != 0)   // Non-factor
            {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumOfFactors(int no){
        //Summation of factors
        int sum = 0;
        for (int i=1; i<no ; i++){
            if (no % i ==0 ){
                sum +=i;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int value = scanner.nextInt();

        int sumNonFactorsResult = sumOfNonFactors(value);
        int sumFactorsResult = sumOfFactors(value);
        int finalResult = sumFactorsResult - sumNonFactorsResult;
        System.out.println("Difference between summation of it's Factor and Non-Factor is :" +finalResult);
        scanner.close();
    }
}
