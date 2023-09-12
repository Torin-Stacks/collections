package functionalInterfaces;

public class BiPredicate {
    public static void main(String[] args) {
        java.util.function.BiPredicate<int[], Integer> biPredicate = (numbers, number)-> numbers[2]== number;
    }
}
