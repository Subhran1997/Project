package com.streams.main;

import java.util.Objects;

/**
 * @author Subhranshu
 *
 * @param <T>
 */
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    default Predicate<T> negate() {
        return t -> !this.test(t);
    }

    default Predicate<T> and(Predicate<T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) && other.test(t);
    }

    default Predicate<T> xOr(Predicate<T> other) {
        Objects.requireNonNull(other);
        return t -> this.test(t) ^ other.test(t);
    }
}
