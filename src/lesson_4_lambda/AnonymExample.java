package lesson_4_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

public class AnonymExample {
    public static void main(String[] args){

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }

        };
        r.run();
        Runnable r2 = () -> System.out.println("Hello!");
        r2.run();

        Comparator<String> comparator = (s1, s2)
                -> s1.compareTo(s2) > 0 ? -1 : s1.compareTo(s2) < 0 ? 1 : 0;

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("12");


        Arrays.asList("one", "two", "3", "4").forEach(s -> System.out.println(s));
        Arrays.asList("one", "two", "3", "4")
                .forEach(s -> {
                    if (s.length() == 1) {
                        System.out.println(s);
                    }
                });

        //lambda isn't instance variable
        int wordLength = 1;//take var. and use it it lambda expression
        Arrays.asList("one", "two", "3", "4")
                .forEach(s -> {
                    if (s.length() == wordLength) {
                        System.out.println(s);
                    }
                });
        //wordLength defective final var. it can't be changed


        Comparator<Integer> comparator1 = (i1, i2) ->
                i1.compareTo(i2) < 0 ? -1 : i1.compareTo(i2) > 0 ? 1 : 0;
        Comparator<Integer> comparator2 = Integer::compare;

        //-----------------------------------------------
        AnonymExample anonymExample = new AnonymExample();
        Comparator<Integer> comparator3 = anonymExample::comp;
        Arrays.asList("one", "two", "3").forEach(System.out::println);
        //-----------------------------------------------
    }

    //always return 0!
    public int comp(int x, int y) {
        return 0;
    }

}
