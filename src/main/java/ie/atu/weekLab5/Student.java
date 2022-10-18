package ie.atu.weekLab5;

public class Student
{
    private String nameStudent;
    private String emailStudent;
    private String courseStudent;

    public Student(){
        this.nameStudent = "";
    }

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public String getCourseStudent() {
        return courseStudent;
    }

    public void setCourseStudent(String courseStudent) {
        this.courseStudent = courseStudent;
    }
}
