package com.optionalclass;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "TRACES";
        Optional<String>checkNull =
                Optional.ofNullable(str[0]);
        if (checkNull.isPresent()) {
            String word = str[0].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("string is null");
    }
}
