package functionalInterfaces;

import java.util.function.DoubleConsumer;

public class DoubleConsumerExample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer =(number) -> System.out.println(number*2);
        doubleConsumer.accept(2);
    }

}
