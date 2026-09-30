public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] fleet = { new SUV(), new sportsCar(), new Hybrid() };
        String[] expected = {
            "Trail SUV: forward with all-wheel traction.",
            "Trail SUV: reverse with rear camera assistance.",
            "Sprint sports car: forward with sport throttle response.",
            "Sprint sports car: reverse at controlled low speed.",
            "Eco Hybrid: forward using electric motor assistance.",
            "Eco Hybrid: reverse using electric drive."
        };
        int index = 0;
        for (Vehicle vehicle : fleet) {
            String forward = vehicle.forward();
            String reverse = vehicle.reverse();
            if (!forward.equals(expected[index++]) ||
                    !reverse.equals(expected[index++])) {
                throw new AssertionError("Incorrect subclass dispatch");
            }
            System.out.println(forward);
            System.out.println(reverse);
        }
        System.out.println("PASS: all six overridden calls "
                + "matched expected behavior.");
    }
}
