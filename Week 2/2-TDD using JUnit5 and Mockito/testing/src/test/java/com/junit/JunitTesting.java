package com.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class JunitTesting{

    Arthemetic calculator = new Arthemetic();

    @Test
    public void testAdd() {
        assertEquals("Addition should return correct sum", 5, calculator.add(2, 3));
    }

    @Test
    public void testIsEvenTrue() {
        assertTrue("4 should be even", calculator.isEven(4));
    }

    @Test
    public void testIsEvenFalse() {
        assertFalse("5 should not be even", calculator.isEven(5));
    }

    @Test
    public void testGetGreetingNotNull() {
        assertNotNull("Greeting should not be null", calculator.getGreeting("Adnan"));
    }

    @Test
    public void testGreetingContent() {
        assertEquals("Hello, Adnan", calculator.getGreeting("Adnan"));
    }

    @Test
    public void testGetGreetingWithNull() {
        assertNull("Should return null for null input", calculator.getGreeting(null));
    }

}
