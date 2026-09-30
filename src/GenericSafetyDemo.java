public class GenericSafetyDemo {
    public static void main(String[] args) {
        GenericBox<String> label = new GenericBox<>();
        label.set("Fleet ready");
        String message = label.get();
        GenericBox<Integer> count = new GenericBox<>();
        count.set(3);
        System.out.println(message + "; vehicle count = " + count.get());

        // Deliberately unsafe example: keep warnings visible.
        GenericBox raw = label;
        raw.set(42);
        try {
            String corrupted = label.get();
            throw new AssertionError("Unexpected value: " + corrupted);
        } catch (ClassCastException expected) {
            System.out.println("EXPECTED: raw-type misuse caused ClassCastException.");
        }
    }
}
