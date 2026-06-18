package Assignment8and10;

import java.util.Scanner;

/* Write a program which accept width & height of rectangle from user and calculate
its area. (Area = Width * Height)
Input :
5.3
9.78
Output: 51.834 */
public class Problem2 {
    public static void calculateArea(float width, float height){
        float area = width * height;
        System.out.println("Area is : "+area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width :");
        float width = scanner.nextFloat();
        System.out.println("Enter the height :");
        float height = scanner.nextFloat();
        calculateArea(width,height);
        scanner.close();
    }
}
