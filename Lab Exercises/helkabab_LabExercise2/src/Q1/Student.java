package Q1;

public class Student {

    // The following are private variables that are initialized to later be used as placeholders for data.
    private String name;
    private int studentNumber;
    private int score;
    public Student(){ // This is a constructor with my information.
        name = "Hamza Elkababji";
        studentNumber = 251276422;
        score = 100;
    }

    public Student(String nm, int sn, int sc){ // This is a constructor with the parameters needed to default the variables as the inputted data from the user.
        name = nm;
        studentNumber = sn;
        score = sc;
    }

    // All of the following are getters and setters which are used to either return values back to another method, or set them as one of the private variables.
    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public void setStudentNumber(int sn){
        studentNumber = sn;
    }

    public void setScore(int sc){
        score = sc;
    }

    // The following is a method that we use to output the letter grade corresponding to the mark the user inputs using if else if statements.
    public String getLetterGrade(){
        String letterGrade = null;
        if(score >= 90)
            letterGrade = "(The Grade is: A+)";
        else if (score >= 80)
            letterGrade = "(The Grade is: A-)";
        else if (score >= 70)
            letterGrade = "(The Grade is: B+)";
        else if (score >= 60)
            letterGrade = "(The Grade is: B-)";
        else if (score >= 50)
            letterGrade = "(The Grade is: C+)";
        else if (score >= 40)
            letterGrade = "(The Grade is: C-)";
        else if (score >= 30)
            letterGrade = "(The Grade is: D)";
        else
            letterGrade = "(The Grade is: F)";
        return letterGrade;
        }
    /** The reason the if statement works is we first check if it is above or equal to 90, which
     *  if it is, it will instantly jump to line 62. However, if it does not, now we know it is
     *  less than 90, so all we need to do is check if it is above or equal to 80 and do the same
     *  process where if that is true it will jump to line 62, if not, it will continue in the
     *  if statement.*/

    // The print info method simply is used to be a placeholder for the other methods and out put it to the screen when called by the main class.
    public void printInfo(){

        System.out.printf("%s%20d%20d%3s\n", name, studentNumber, score, getLetterGrade());
    }
}
