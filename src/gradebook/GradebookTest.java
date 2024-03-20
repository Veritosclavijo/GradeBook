package gradebook;

public class GradebookTest {
    public static void main(String[] args) {

        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming");
        GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java");

        System.out.println("gradeBook1 course name is: " + gradeBook1.displayMessage());
        System.out.println("gradeBook2 course name is: " + gradeBook2.displayMessage());


    }
}
