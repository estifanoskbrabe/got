public abstract class Decorator implements Nameable {
    protected Nameable nameable;

    public Decorator(Nameable nameable) {
        this.nameable = nameable;
    }


    public String correctName() {
        return nameable.correctName();
    }
}