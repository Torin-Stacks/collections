package functionalInterfaces;

public class LongConsumer {
    public static void main(String[] args) {
       java.util.function.LongConsumer longConsumer =(number) -> System.out.println(number*2);
       longConsumer.accept(6);

    }
}
