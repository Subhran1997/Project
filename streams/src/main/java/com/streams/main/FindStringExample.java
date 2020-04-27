package com.streams.main;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Subhranshu
 *
 */
public class FindStringExample {
    /**
     * @param listOfStrings is listStrings
     * @param ch            single String
     * @return values
     */
    public final String findFirstStringStartsWithOneCharacter(
            final Stream<String> listOfStrings, final String ch) {

        Optional<String> firstStringWithCharacter =
                listOfStrings.filter(i -> i.startsWith(ch)).findFirst();

        if (firstStringWithCharacter.isPresent()) {
            return firstStringWithCharacter.get();
        }
        return null;
    }

}
