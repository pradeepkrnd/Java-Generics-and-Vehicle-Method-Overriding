public class sportsCar extends Vehicle {
    public sportsCar() { super("Sprint sports car"); }
    @Override
    public String forward() {
        return name() + ": forward with sport throttle response.";
    }
    @Override
    public String reverse() {
        return name() + ": reverse at controlled low speed.";
    }
}
