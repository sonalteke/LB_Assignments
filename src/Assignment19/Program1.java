package Assignment19;

import java.util.Scanner;

/* Write a program to check whether the given year is leap year or not */
public class Program1 {
    void checkLeapYear(int year){
        if (year % 4 ==0 && year % 100 != 0 || (year % 400 == 0)){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not leap year");
        }
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = sobj.nextInt();

        Program1 program1 = new Program1();
        program1.checkLeapYear(year);

        sobj.close();
    }
}
