package com.streams.main;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Subhranshu
 *
 */
public class StringExcercises {

    /**
     * @param string string value
     * @return values value
     */
    public static int countLowercaseLetters(final String string) {
        // int a = 1;
        return (int) string.chars().filter(Character::isLowerCase).count();
        // string.chars().filter(Character :: isLo)
    }

    /**
     * @param strings nullstring
     * @return values nullvalue
     */
    public static Optional<String> mostLowercaseString(
            final List<String> strings) {
        return strings.stream().max(
                Comparator.comparing(StringExcercises::countLowercaseLetters));
    }
}
