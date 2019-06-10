package cn.edu.hqu.cst.Course;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;
    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void addStudent(String student){
        this.students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student){
        students[numberOfStudents - 1] = null;
        numberOfStudents--;
    }

    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents(){
        return  numberOfStudents;
    }
}
