package Q2;

import Q1.CircleInfoHamza;

public class StudentDemoClassHamza {
    public static void main (String[] args){ // The Driver Method

        // Declared all variables manually, and the first one from the method with 0 parameters in the Student class.
        Student hamza = new Student();
        Student student1 = new Student(250221375,"Addiie", "Slowgrave");
        Student student2 = new Student(250309716, "Talia", "Hanscom");
        Student student3 = new Student(241276433, "Samer", "Issa");
        Student student5 = new Student(243796541, "Yousef", "Soufan");

        // Importing the header from a different package's class, so I do not have to keep repeating it.
        CircleInfoHamza.myHeader(2,2,"Using constructors to help organize data into a neat list that can be read easily.");

        // Printing out my information by getting the data from the Student class.
        System.out.println("\nHere is my information : \n=============================\nI am " + hamza.getName()
                + "\nStudent Number: " + hamza.getStudentNumber() + "\nEmail Address: " + hamza.getEmailAddress()
                + "\nAge: " + hamza.getAge());

        System.out.println("\nHere is the info on other students: ");
        System.out.printf("===============================\n%-9s %-20s\n", "Number", "Name");
        System.out.printf("%9s %20s\n%9d %-20s\n%9d %-20s\n%9d %-20s\n%9d %-20s\n%30s\n","=========",
                "=====================", student1.getStudentNumber(), student1.getName(),student2.getStudentNumber(),
                student2.getName(), student3.getStudentNumber(), student3.getName(), student5.getStudentNumber(),
                student5.getName(),"===============================\n");
        // Using a printf statement to print out all the data in an orderly and neat fashion.

        CircleInfoHamza.myFooter(2);
        // Same as lines 15 & 16, but this time it is the footer information.
    }
}
