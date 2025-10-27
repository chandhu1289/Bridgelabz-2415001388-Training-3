package college.student;
public class Student {
    private String name;
    private int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void showStudent() {
        System.out.println("--- Student ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}