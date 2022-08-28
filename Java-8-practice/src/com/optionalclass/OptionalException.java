package com.optionalclass;

import java.util.Optional;

public class OptionalException {
    public static void main(String[] args) {
        String value = null;
        Optional<String> optionalValue = Optional.ofNullable(value);
        String result = optionalValue.orElseThrow(ArrayIndexOutOfBoundsException::new);

    }
}
