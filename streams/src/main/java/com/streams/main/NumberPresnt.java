package com.streams.main;

import java.util.stream.Stream;
/**
 * @author Subhranshu.
 *
 */
final class NumberPresent {

    /**
     * @param numbers number.
     * @param num     single number.
     * @return number.
     */
    public boolean isANumberPresentInStream(
            final Stream<Integer> numbers, final int num) {
        return numbers.anyMatch(i -> i == num);
    }
}