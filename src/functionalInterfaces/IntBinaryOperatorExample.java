package functionalInterfaces;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (numberOne,numberTwo) -> numberOne + numberTwo;
        System.out.println(intBinaryOperator.applyAsInt(8, 7));
    }
}
