import java.util.ArrayList;
import java.util.List;

class Person implements Nameable {
    private String name;
    private List<Rental> rentals;

    public Person() {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public Person(int age, String name, boolean parentPermission, int id) {
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    @Override
    public String correct_name() {
        return null;
    }

    @Override
    public String correctName() {
        return null;
    }
}