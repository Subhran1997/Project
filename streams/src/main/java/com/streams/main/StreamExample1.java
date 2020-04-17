package com.streams.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Subhranshu.
 *
 */

public class StreamExample1 {
    public static List<Integer> addTest(final int[] i2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i : i2) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        List<Integer> afterAl = arrayList.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(afterAl);
        return afterAl;
    }

    public final static void main(String[] args) {
        final int i[] = { 0, 5, 10, 20, 25, 30 };
        StreamExample1.addTest(i);
    }

}
