package Assignment30;
/* Write a program which displays ASCII table. Table contains symbol, Decimal,
Hexadecimal and octal representation of every member from 0 to 255 */

public class Program1 {
    public static void display(){
        System.out.println("Decimal\tHex\tOctal\tSymbol");
        for (int i=0; i<=255; i++){
            System.out.println(i + "\t"
                    + Integer.toHexString(i).toUpperCase() + "\t"
                    + Integer.toOctalString(i) + "\t"
                    + (char) i);
        }
    }
    public static void main(String[] args) {
        display();
    }
}
