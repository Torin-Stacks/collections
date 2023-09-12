package functionalInterfaces;

import java.util.Map;

public class BiConsumer {
    public static void main(String[] args) {
        //Map<String,Integer> map = Map.of("torin",001,"tife",002);
        java.util.function.BiConsumer<String, Integer> biconsumer  = (firstName, age)-> System.out.println(firstName+age);
        System.out.println();

       // map.forEach(biconsumer);
    }
}
