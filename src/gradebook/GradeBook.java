package gradebook;

public class GradeBook {

    private String courseName;

    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String displayMessage(){
        return getCourseName();
    }
}
