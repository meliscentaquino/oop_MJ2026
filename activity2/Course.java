public class Course {
    String courseCode;
    String courseTitle;

    Student[] enrolledStudents;

    int enrollmentCount = 0;
    static String schoolName = "My University";

    public Course() {
    }

    public Course(String courseCode, String courseTitle) {
        this.enrolledStudents = new Student[50];
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }

    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course code: " + courseCode);
        System.out.println("Course title: " + courseTitle);
        System.out.println("School name: " + schoolName);
        System.out.println("Enrolled students: ");

        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(
                    enrolledStudents[i].firstName + " " + enrolledStudents[i].middleName + " "
                            + enrolledStudents[i].lastName);
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }
}
