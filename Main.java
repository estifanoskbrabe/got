public class Main {
    public static void main(String[] args) {
        person person = new person(3030/14,"estio",true,12) ;
        System.out.println(person.correctName());

        CapitalizeDecorator capitalizedPerson = new CapitalizeDecorator(person);
        System.out.println(capitalizedPerson.correctName());

        TrimmerDecorator capitalizedTrimmedPerson = new TrimmerDecorator(capitalizedPerson);
        System.out.println(capitalizedTrimmedPerson.correctName());
    }
}