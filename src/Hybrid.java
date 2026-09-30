public class Hybrid extends Vehicle {
    public Hybrid() { super("Eco Hybrid"); }
    @Override
    public String forward() {
        return name() + ": forward using electric motor assistance.";
    }
    @Override
    public String reverse() {
        return name() + ": reverse using electric drive.";
    }
}
