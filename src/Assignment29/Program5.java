package Assignment29;

import java.util.Scanner;

/* Accept division of student from user and depends on the division display exam
timing. There are 4 divisions in school as A,B,C,D.
Exam of division A at 7 AM,B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
(Application should be case insensitive)
Input: C
Output : Your exam at 9.20 AM
Input: d
Output : Your exam at 10.30 AM*/
public class Program5 {
    public static void displaySchedule(char chDiv){
        chDiv = Character.toUpperCase(chDiv);

        switch (chDiv){
            case 'A':
                System.out.println("Your exam is at 7AM");
                break;

            case 'B':
                System.out.println("Your exam is at 8:30AM");
                break;

            case 'C':
                System.out.println("Your exam is at 9:20AM");
                break;

            case 'D':
                System.out.println("Your exam is at 10:30AM");
                break;

            default:
                System.out.println("Invalid division");
                break;
        }

    }
    public static void main(String[] args) {

        char cValue = '\0';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your Division: ");
        cValue = sobj.next().charAt(0);

        displaySchedule(cValue);
    }
}
