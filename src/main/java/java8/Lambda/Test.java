package java8.Lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        Consumer<Integer> c = (Integer x) -> { System.out.println(x); };

        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);

        Predicate<String> p = (String s) -> { s == null };
    }
}
