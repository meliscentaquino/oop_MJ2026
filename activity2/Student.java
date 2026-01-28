public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    
    static int totalStudents = 0;

    public Student(){}
    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email){
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        Student.totalStudents++;
    }
    public String displayStudentInfo(){
        return studentId +"\n" + "Name: " + firstName + middleName + lastName + "\n" + "Gender:" + gender + "\n" + "Email:" + email;
    }
    public String getTotalStudents(){
        return totalStudents;

    }


}
