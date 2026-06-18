package Assignment8and10;

/* 3. Write a program which accept distance in kilometre and convert it into meter. (1
kilometre = 1000 Meter)
Input :
5
Output : 5000 */

import java.util.Scanner;

public class Problem3 {

    public static void kMToMeter(int distance){
        int meter = distance * 1000;
        System.out.println(distance +" Kilometer to meter is :" +meter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        int distance = scanner.nextInt();
        kMToMeter(distance);
        scanner.close();
    }
}
