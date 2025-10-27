import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        // Creating Student and Faculty objects
        Student s1 = new Student("Amol", 101);
        Faculty f1 = new Faculty("Dr. Meena", "Data Structures");

        // Display details
        System.out.println("=== College Details ===");
        s1.showStudent();
        f1.showFaculty();
    }
}