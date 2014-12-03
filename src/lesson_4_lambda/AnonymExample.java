package lesson_4_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class AnonymExample {

    public static void main(String[] args){
        Arrays.asList("one", "two", "3").forEach(System.out::println);
        Comparator<Integer> comparator = Integer::compareTo;
        Function<String, Double> convertor = s -> new Double(s);
        Function<String, Double> convertor2 = Double::new;
        System.out.println(convertor2.apply("2.2").getClass().getSimpleName());
    }

}
//http://hexlet.org/lesson/java_102_4/ 36:13
