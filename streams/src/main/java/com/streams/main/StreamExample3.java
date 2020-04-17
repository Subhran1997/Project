package com.streams.main;

import java.util.Arrays;
import java.util.List;

/**
 * @author Subhranshu.
 *
 */

public class StreamExample3 {
    public final int addname1(final String string) {
        List<String> names = Arrays.asList("A", "B", "C", "D");
        for (String name : names) {
            if (!name.equals("A")) {
                System.out.println(name);
            }

        }
        names.stream().filter(name -> !name.equals("B"))
        .forEach(name -> System.out.println(name));
        return 0;
    }
}
