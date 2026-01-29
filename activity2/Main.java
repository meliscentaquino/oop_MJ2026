public class Main {
    public static void main(String[] args) {
        System.out.println("Total Students: " + Student.getTotalStudents());
        Student student1 = new Student();
        student1.firstName = "Felicity";
        student1.middleName = "Lim";
        student1.lastName = "Harris";
        student1.gender = "Female";
        student1.email = "";

        Student student2 = new Student();
        student2.firstName = "Aysha Ria";
        student2.middleName = "Dy";
        student2.lastName = "Woods";
        student2.gender = "Female";
        student2.email = "";

        Student student3 = new Student();
        student3.firstName = "Sarah Jasmine";
        student3.middleName = "Esteban";
        student3.lastName = "Walsh";
        student3.gender = "Female";
        student3.email = "";

        Student student4 = new Student();
        student4.firstName = "Peter";
        student4.middleName = "Hamilton";
        student4.lastName = "Parker";
        student4.gender = "Male";
        student4.email = "";

        Student student5 = new Student();
        student5.firstName = "Hermione";
        student5.middleName = "Inez";
        student5.lastName = "Morgan";
        student5.gender = "Female";
        student5.email = "";

        Student student6 = new Student();
        student6.firstName = "Tiffany";
        student6.middleName = "Inez";
        student6.lastName = "Morgan";
        student6.gender = "Female";
        student6.email = "";

        System.out.println("Total Students: " + Student.getTotalStudents());

        Course myCourse = new Course();
        myCourse.courseCode = "CS101";
        myCourse.courseTitle = "Introduction to Programming";

        Course.enrolledStudents(student5);
        Course.enrolledStudents(student6);



    }

}
