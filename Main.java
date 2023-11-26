public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.correct_name());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correct_name());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correct_name());

        Student student = new Student("john doe", "Class A");
        System.out.println(student.correct_name());

        CapitalizeDecorator capitalizedStudent = new CapitalizeDecorator(student);
        System.out.println(capitalizedStudent.correct_name());

        TrimmerDecorator capitalizedTrimmedStudent = new TrimmerDecorator(capitalizedStudent);
        System.out.println(capitalizedTrimmedStudent.correct_name());

        Teacher teacher = new Teacher("jane smith", "Mathematics");
        System.out.println(teacher.correct_name());

        CapitalizeDecorator capitalizedTeacher = new CapitalizeDecorator(teacher);
        System.out.println(capitalizedTeacher.correct_name());

        TrimmerDecorator capitalizedTrimmedTeacher = new TrimmerDecorator(capitalizedTeacher);
        System.out.println(capitalizedTrimmedTeacher.correct_name());
    }


}