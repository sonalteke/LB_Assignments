package Assignment4;//Write a program which accept number from user and return summation of all its non factors.

import java.util.Scanner;

public class Problem4 {
        public static int sumNonFactors(int no)
        {
            int sum = 0;
            for(int i = 1; i < no; i++)
            {
                if(no % i != 0)   // Non-factor
                {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int value = sc.nextInt();

            int result = sumNonFactors(value);
            System.out.println("Summation of non-factors = " + result);

            sc.close();
        }
    }

