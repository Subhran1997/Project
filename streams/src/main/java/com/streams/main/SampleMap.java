package com.streams.main;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Subhranshu
 *
 */
public class SampleMap {
    /**
     * @param num number.
     * @return list.
     */
    public static List<Integer> multiplyNum(final List<Integer> num) {
    List<Integer> list = num.stream().map(i -> i * i).collect(Collectors.toList());
    return list;

    }
    
}
