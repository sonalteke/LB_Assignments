package Assignment31;

import java.util.Scanner;

/* Write  a program which accept a String from user and count number of
small characters*/
public class Program2 {
    public static void countCapital(String string){
        int count = 0;
        for (int i=0; i< string.length(); i++){
            char ch = string.charAt(i);
            if (Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.println("Number of capital characters: " + count);

    }
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = sobj.nextLine();

        countCapital(string);

        sobj.close();

    }
}
