package Assignment19;

/* write a program to display the grade of the student based on marks*/
public class Program2 {
    void displayGrade(int marks){
        if (marks >=90){
            System.out.println("Grade : A+");
        }else if (marks >=80){
            System.out.println("Grade : A");
        } else if (marks >= 70) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >=50) {
            System.out.println("Grade : D");
        }else {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) {
        Program2 program2 = new Program2();
        program2.displayGrade(81);
    }
}
