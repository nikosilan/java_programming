
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1, "Matti Meikäläinen", 25);
        Course course = new Course("JAVA101", "Java Programming", "Teacher Smith");

        Enrollment enrollment = new Enrollment(
                student, course, "10.11.2026"
        );

        // Save the enrollment to a file
        try {
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("enrollments.ser")
            );

            output.writeObject(enrollment);
            output.close();

            System.out.println("Enrollment saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving enrollment: " + e.getMessage());
        }

        // Read the enrollment from the file
        try {
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("enrollments.ser")
            );

            Enrollment savedEnrollment = (Enrollment) input.readObject();
            input.close();

            System.out.println("\nEnrollment information:");
            System.out.println("Student ID: " + savedEnrollment.getStudent().getId());
            System.out.println("Student name: " + savedEnrollment.getStudent().getName());
            System.out.println("Student age: " + savedEnrollment.getStudent().getAge());

            System.out.println("Course code: " + savedEnrollment.getCourse().getCourseCode());
            System.out.println("Course name: " + savedEnrollment.getCourse().getCourseName());
            System.out.println("Instructor: " + savedEnrollment.getCourse().getInstructor());

            System.out.println("Enrollment date: " + savedEnrollment.getEnrollmentDate());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading enrollment: " + e.getMessage());
        }
    }
}
