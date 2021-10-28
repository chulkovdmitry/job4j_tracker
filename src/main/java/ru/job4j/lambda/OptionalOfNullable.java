package ru.job4j.lambda;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        if (strings.stream()
                .filter(user -> user.equals(value))
                .findFirst().isEmpty())
            return Optional.empty();
        return strings.stream()
                .filter(user -> user.equals(value))
                .findFirst();
    }
}
