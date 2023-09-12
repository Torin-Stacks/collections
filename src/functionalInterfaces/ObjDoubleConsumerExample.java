package functionalInterfaces;

import java.util.function.ObjDoubleConsumer;

public class ObjDoubleConsumerExample {
    public static void main(String[] args) {
        ObjDoubleConsumer<Person> objDoubleConsumer = (person, number) -> person.setAge(number);
        Person person = new Person("Tamara",10);
        objDoubleConsumer.accept(person, 400);
        System.out.println(person);
    }
    }


