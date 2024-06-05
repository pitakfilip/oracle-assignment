package cz.muni.fi.oracle.assignment;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class NumberPrinter {

    private static final IntPredicate IS_EVEN = num -> num % 2 == 0;

    private static final IntPredicate DIVISIBLE_BY_5 = num -> num % 5 == 0;

    public static void main(String[] args) {
        IntStream.range(1, 100).forEach(num -> {
                    String result = "";

                    if (IS_EVEN.test(num)) {
                        result += "Baz";
                    }
                    if (DIVISIBLE_BY_5.test(num)) {
                        result += "inga!";
                    }

                    System.out.println(result.isEmpty() ? num : result);
                }
        );

    }

}
