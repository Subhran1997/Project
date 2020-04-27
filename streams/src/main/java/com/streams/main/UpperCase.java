package com.streams.main;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Subhranshu
 *
 */
public class UpperCase {

    /**
     * @param words listofstringvalue
     * @return values value
     */
    public final List<String> allToUpperCase(final List<String> words) {
        int a = 5;
        return words.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
    }
}
