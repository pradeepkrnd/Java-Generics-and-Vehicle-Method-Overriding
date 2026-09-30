public abstract class Vehicle {
    private final String name;
    protected Vehicle(String name) { this.name = name; }
    protected final String name() { return name; }
    public abstract String forward();
    public abstract String reverse();
}
