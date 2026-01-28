public class Course {
    String courseCode;
    String courseTitle;

    Student[] enrolledStudents;

    int enrollmentCount = 0;
    static String schoolName = "My University";

    public Course(){}

    public Course(String courseCode, String courseTitle){
        this.enrolledStudents = new Student[50];
    }
    public void enrollStudent(Student student){
       
    }
    public void displayCourseInfo(){
        return schoolName + courseCode + courseTitle;
    }
    public static String getSchoolName(){
        return schoolName;
    }
}
