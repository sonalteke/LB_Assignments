package Assignment7;

import java.util.Scanner;

//Write a program which returns difference between Even factorial and Odd factorial og given number
public class Problem5 {

    public static void difference(int number){

        //Even factorial
        long evenFactResult = 1;

        for (int i = Math.abs(number); i >= 2; i--) {
            if (i % 2 == 0){
                evenFactResult = evenFactResult * i;
                System.out.println("Even Factorials numbers are : "+ i + " ");
            }
        }
        System.out.println("Even Factorial of " + number + " = " + evenFactResult);

        //Odd factorial
        long oddFactResult = 1;

        for (int i = number; i >= 1; i--) {
            if (i % 2 != 0) {
                oddFactResult = oddFactResult * i;
                System.out.println("Odd Factorials numbers are : " + i + " ");
            }

        }
        System.out.println("Odd Factorial of " + number + " = " + oddFactResult);

        long finalResult = evenFactResult - oddFactResult;
        System.out.println("Difference between Even and Odd factorial number is: "+finalResult);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        difference(number);
        scanner.close();
    }
}
