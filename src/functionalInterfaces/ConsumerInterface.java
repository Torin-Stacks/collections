package functionalInterfaces;

import java.util.Set;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
//        functional interface that takes an argument and returns nothing
        //Set<Integer> set = Set.of(20,40,90,70);
        Consumer<Integer> consumer = System.out::println;
        //set.forEach(consumer);
        consumer.accept(12);

       // System.out.println();
        //    above is same as
        //set.forEach( System.out::println);
    }

    }
