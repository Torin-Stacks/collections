package functionalInterfaces;

import java.util.function.BooleanSupplier;

public class BooleanSupplierExample {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier = ()-> true;
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
