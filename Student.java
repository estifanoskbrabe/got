public class Student extends Person{
    private String classroom;

    public Student(String johnDoe, String classA) {
        super();
    }

    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public Student(boolean parent_permission, int age, String name, int id) {
        super(age, name, parent_permission, id);
    }
}