package com.streams.main;

import java.util.List;
import java.util.stream.Collectors;

public class LowerCase {

    /**
     * @param words
     * @return
     */
    public final List<String> allToLowerCase(final List<String> words) {
        return words.stream().map(string ->
        string.toLowerCase()).collect(Collectors.toList());
    }
}
