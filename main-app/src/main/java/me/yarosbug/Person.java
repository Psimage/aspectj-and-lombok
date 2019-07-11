package me.yarosbug;

import lombok.Value;

@Value
public class Person {
    String name;
    int age;

    @ApplyHelloAspectAdvice
    public static String createHelloWorldString() {
        return "Hello, World!";
    }
}
