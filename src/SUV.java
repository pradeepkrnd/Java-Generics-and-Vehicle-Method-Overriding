public class SUV extends Vehicle {
    public SUV() { super("Trail SUV"); }
    @Override
    public String forward() {
        return name() + ": forward with all-wheel traction.";
    }
    @Override
    public String reverse() {
        return name() + ": reverse with rear camera assistance.";
    }
}
