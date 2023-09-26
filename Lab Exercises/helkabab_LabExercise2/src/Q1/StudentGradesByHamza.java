package Q1;
import java.util.Scanner;
public class StudentGradesByHamza {

    public static Scanner input = new Scanner(System.in);
    public static int counter = 0; // Declared a variable using static, so it is available for the entire class.

    // The following method will take the user's inputs and store it in the Student reference variable "s".
    public static void dataEntry(Student s) {
        counter++;
        System.out.println("\nStudent " + counter+":");
        System.out.print("Enter Student number: ");
        s.setStudentNumber(input.nextInt());
        input.nextLine();
        System.out.print("Enter Student's full name: ");
        String name = input.nextLine();
        s.setName(name);

        System.out.print("Enter " + name + "'s score: ");
        int score = input.nextInt();
        s.setScore(score);
    }

    // Similar to the if statement in the Student.java class, this just compares two student's grades and returns which is true.
    public static int compareGrades(Student s1, Student s2){
        int x; // Used to store the value outside the if statement, so like a placeholder.
        if (s1.getScore() > s2.getScore())
            x = 1;
        else if (s1.getScore() < s2.getScore())
            x= -1;
        else
            x = 0;
        return x;
    }

    // The following is extremely similar to all previous assignments and exercises, just a header.
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("Lab Exercise: " + labNum + ", Question: " + questionNum);
        System.out.println("Program Description: " + description);
    }

    // Same thing but now a footer.
    public static void myFooter(int questionNumber){
        System.out.println("\n*** Signing off from Question " + questionNumber + " - Hamza Elkababji ***");
    }


    public static void main(String[] args) {
        System.out.println("***************************************************************");
        System.out.println("Full name: Hamza Elkababji");
        myHeader(2,1,"We will output student information along as the comparison between two students adn their letter grade.");
        System.out.println("***************************************************************");
        // This links back to the myHeader method.

        // This is creating an object(instance) of the constructor we made to print out the information.
        Student s1 = new Student();
        System.out.println("Here is my grade-info: ");
        s1.printInfo();
        System.out.print("\n\n");

        // Exactly the same as the object above, also with no arguments.
        Student s2 = new Student();
        System.out.println("Data entry as follows... ");
        dataEntry(s1);
        dataEntry(s2);
        System.out.print("\n");

        // This will format with the alignment based on the output code to make it look nice.
        System.out.println("Here is the detail info...");
        System.out.printf("%s%20s%20s%3s\n","Name", "Student Number", "Score ", "(Letter Grade)");
        System.out.println("-----------------------------------------------------------------");
        s1.printInfo();
        s2.printInfo();
        System.out.println("-----------------------------------------------------------------");

        // This is similar to previous if statements, just now it outputs the correct wording of the result of who got a higher mark.
        if (compareGrades(s1,s2) == 1)
            System.out.println("Note: " + s1.getName() + " scored higher than " + s2.getName() + ".");
        else if (compareGrades(s1,s2) == -1)
            System.out.println("Note: " + s2.getName() + " scored higher than " + s1.getName() + ".");
        else
            System.out.println("Note: Their scores are equal!");

        myFooter(1);
    }
}
