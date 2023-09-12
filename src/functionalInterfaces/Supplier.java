package functionalInterfaces;

public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<String> supplier = () -> "all stars";
        System.out.println(supplier.get());
    }
}
