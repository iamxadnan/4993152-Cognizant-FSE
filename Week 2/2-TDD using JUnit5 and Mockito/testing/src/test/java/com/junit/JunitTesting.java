package com.junit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.*;


public class JunitTesting {
    private Arthemetic calculator;

    @Before
    public void setUp() {
        calculator=new Arthemetic();
    }

    @After
    public void tearDown() {
        calculator=null;
    }

    @Test
    public void testAdd() {
        int a=2,b=3;
        int result=calculator.add(a,b);
        assertEquals(5,result);
    }

    @Test
    public void testIsEvenTrue() {
        int number=4;
        boolean result=calculator.isEven(number);
        assertTrue(result);
    }

    @Test
    public void testIsEvenFalse() {
        int number=5;
        boolean result=calculator.isEven(number);
        assertFalse(result);
    }

    @Test
    public void testGetGreetingWithName() {
        String name="Adnan";
        String result=calculator.getGreeting(name);
        assertEquals("Hello, Adnan",result);
    }

    @Test
    public void testGetGreetingWithNull() {
        String name=null;
        String result=calculator.getGreeting(name);
        assertNull(result);
    }
}
