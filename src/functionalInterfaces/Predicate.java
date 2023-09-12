package functionalInterfaces;

public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<String> predicate = (astring) -> astring.equals("3");
        System.out.println(predicate. test("3"));
        System.out.println(predicate. test("e"));
    }
}
