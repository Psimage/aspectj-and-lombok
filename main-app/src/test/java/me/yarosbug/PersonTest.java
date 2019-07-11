package me.yarosbug;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void aspectsApplied() {
        assertEquals("Hello from Aspect!", Person.createHelloWorldString());
    }

    @Test
    public void lombokApplied() {
        assertEquals("Person(name=John, age=32)", new Person("John", 32).toString());
    }
}
