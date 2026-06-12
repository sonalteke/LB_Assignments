package Assignment7;

// Write a program to accept amount in US dollar and return its value in Indian currency
//Ex. consider 1$ as 70 Rupees
import java.util.Scanner;

public class Problem2 {

    public static void dollarToINR(double number){
        double exchangeRate = 70;
        double rupees = number * exchangeRate;
        System.out.println("Indian value is: "+rupees);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dollar:");
        double dollar = scanner.nextInt();
        dollarToINR(dollar);
        scanner.close();
    }
}
