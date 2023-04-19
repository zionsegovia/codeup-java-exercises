package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Weiner Boy");

        // Add some grades
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(95);

        // Test the getName method
        System.out.println("Student name: " + student.getName());

        // Test the getGradeAverage method
        System.out.println("Grade average: " + student.getGradeAverage());
    }
}
