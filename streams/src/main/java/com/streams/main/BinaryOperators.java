package com.streams.main;

import java.util.function.BinaryOperator;

/**
 * @author Subhranshu.
 *
 */
public class BinaryOperators {

    public final Integer additionTwoNum(final int num1, final int num2) {

        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;

        return func2.apply(num1, num2);

    }
}