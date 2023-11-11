public class Teacher extends person{
    public Teacher(String name,int id,  boolean parent_permission, int age, String specialization) {
        super(id, name, parent_permission,age);

        this.specialization = specialization;
    }
    String specialization;
    public boolean canUseServices() {
        return true;
    }
}